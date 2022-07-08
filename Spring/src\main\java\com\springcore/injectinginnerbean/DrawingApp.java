package com.springcore.injectinginnerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public  static void  main(String[] args)
	{
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	//	Triangle triangle = (Triangle) factory.getBean("triangle");
	//	triangle.draw();
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanpostprocessor/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
	}

}



