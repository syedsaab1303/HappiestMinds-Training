
//injecting collection type(list ,set , map , properties)

package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1=(Emp) context.getBean("emp1");
		
		System.out.println("The name is:-");
		System.out.println(emp1.getName());
		
		System.out.println("The nuumber is:-");
		System.out.println(emp1.getPhones());
		
		System.out.println("The address is:-");
		System.out.println(emp1.getAddresses());
		
		System.out.println("The course is:-");
		System.out.println(emp1.getCourses());
		
		System.out.println("The properties is:-");
		System.out.println(emp1.getProps());
		
	}

}