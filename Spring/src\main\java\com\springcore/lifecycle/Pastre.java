//implementing bean lifecycle method using Annotation  

package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pastre {

	private String name;
	private int rate;
	
	public Pastre(String name, int rate) {
		super();
		System.out.println("Parameterized constructor");
		
		this.name = name;
		this.rate = rate;
	}

	public Pastre() {
		super();
		System.out.println("Parameterized constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pastre [name=" + name + ", rate=" + rate + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is init pastre method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy pastre method");
	}
	
}

// Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE. Since Java EE was deprecated in Java 9, and removed in Java 11, we have to add an additional dependency to use these annotations:
/*
<dependency>
<groupId>javax.annotation</groupId>
<artifactId>javax.annotation-api</artifactId>
<version>1.3.2</version>
</dependency>

postconstruct and predestroy is bydefault disabled so we have to enable it , we go to .xml file and use annotation given below:- 
	<context:annotation-config />  with this tag all the annotations is  enabled.

*/


