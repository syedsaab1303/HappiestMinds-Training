package com.springcore.stereotype.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.util.Ha

public class testStereo {

	public static void main(String args[]) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/beanscopes/stereoConfig.xml");

		Driver dri = con.getBean("don", Driver.class); // don - because explicitly name is assigned

//		System.out.println(dri);
		System.out.println(dri.hashCode());

		// Collections used in Driver
//		System.out.println(dri.getRate());
//		System.out.println(dri.getRate().getClass());
//		System.out.println(dri.getRate().getClass().getName());

		Driver dri2 = con.getBean("don", Driver.class);
		System.out.println(dri2.hashCode()); // prototype scope with the help of annotation

		
		// example of prototype scope and  prototype assign in bean of config.xml 
		Teacher t1 = con.getBean("teacher", Teacher.class);
		Teacher t2 = con.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode()); 
		System.out.println(t2.hashCode()); 
		
		
	}
}

/* 

		Bean Scope 
		
		when we want object from  spring container which is configured by xml file or annotation then spring container follow which scope to get the object
		
		some scopes
		
		Singleton (Singleton scope is bydefault and it give everytime same object)
		prototype (every time give new object)
		request (web application which is specific by http request)
		session (web application which is specific by http session)
		globalsession (used for portlet application)
		
		
		Configure bean scope
		
		1) Through XML file
		<bean class="" name="" scope="" />
		
		2) Through Annotation
		@Component
		@Scope(" ")
		Class Student
		{
		}
		
		We use @Scope only with Component annotation
		
	
 */