
package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired                     // Autowiring in property
	@Qualifier("address2")  // bean ka name daalna hai
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired              // Autowiring in setter method
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

//	@Autowired  //Autowiring in constructor
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

