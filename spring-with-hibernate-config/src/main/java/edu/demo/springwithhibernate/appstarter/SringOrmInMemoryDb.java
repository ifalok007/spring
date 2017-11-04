package edu.demo.springwithhibernate.appstarter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.demo.springwithhibernate.model.Address;
import edu.demo.springwithhibernate.model.Employee;
import edu.demo.springwithhibernate.service.EmployeeService;

public class SringOrmInMemoryDb {
	public static void main(String[] args){
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			System.out.println("loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		EmployeeService empService = ctx.getBean(EmployeeService.class);
		Employee emp = new Employee();
		emp.setName("Alok");
		emp.setEmpId(108261l);
		
		Set<Address> addresses = new HashSet<Address>();
		
		Address address1=new Address();
		//address1.setAddressId("mi_ghente");
		address1.setPin(411014);
		address1.setStreet("ramwadi");
		address1.setEmployee(emp);
		
		addresses.add(address1);

		emp.setAddresses(addresses);
		
		empService.addEmployee(emp);
		
		System.out.println(empService.getAllEmployees());
		
	}

}
