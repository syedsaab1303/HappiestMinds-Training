
//autowiring in spring through annotation

package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/Autowireconfig.xml");
		
		Employee emp = con.getBean("emp", Employee.class);		
		
		System.out.println(emp);
		
	}

}


/*
 * we use autowired in setter injecction , property or variable and constructor
  
  */
 