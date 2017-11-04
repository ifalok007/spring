package edu.demo.springwithhibernate.dao;

import java.util.List;

import edu.demo.springwithhibernate.model.Address;
import edu.demo.springwithhibernate.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	Integer persist(Employee emp);
	void persist(Address addr);
	List<Address> getAdressesOfEmployee(Employee emp);

}
