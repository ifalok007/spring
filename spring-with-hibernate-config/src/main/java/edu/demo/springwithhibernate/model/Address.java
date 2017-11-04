package edu.demo.springwithhibernate.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String street;
	private Integer pin;
	@ManyToOne
	@JoinColumn(name="empId")
	private Employee employee;
	
	public Address() {
		super();
	}
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}
}
