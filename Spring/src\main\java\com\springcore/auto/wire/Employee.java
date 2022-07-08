package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	@Autowired
	private Address address;  // ye address and config.xml ke bean ka name=address same rha to iske andar puri property aa jayeggi

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside employee constructor");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}

