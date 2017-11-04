package edu.demo.springwithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.demo.springwithhibernate.model.Address;
import edu.demo.springwithhibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@PersistenceContext
	EntityManager em;
	
	public List<Employee> getAllEmployees() {
		return em.createQuery("SELECT emps FROM Employee emps LEFT JOIN FETCH emps.addresses").getResultList();
	}

	public Integer persist(Employee emp) {
		try{
			em.persist(emp);
		}catch(Exception e){
			e.printStackTrace(System.out);
			return 1;
		}
		return 0;
	}
	public void persist(Address addr) {
		em.persist(addr);
	}

	public List<Address> getAdressesOfEmployee(Employee emp) {
		Query query = em.createQuery("SELECT address FROM Address address WHERE address.empId=?");
		query.setParameter(1, emp.getEmpId());
		List<Address> addressList = query.getResultList();
		return addressList;
	}
	
}
