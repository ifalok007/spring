package edu.demo.springwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.demo.springwithhibernate.dao.EmployeeDao;
import edu.demo.springwithhibernate.model.Employee;
@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	
	@Transactional
	public Integer addEmployee(Employee emp) {
		return empDao.persist(emp);
	}
	
	@Transactional
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}
}
