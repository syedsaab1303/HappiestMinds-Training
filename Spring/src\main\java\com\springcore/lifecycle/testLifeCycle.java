package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLifeCycle {

	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		Tapri t = (Tapri) con.getBean("tap");
	//	System.out.println(t);
		
		
	//	System.out.println("==============================================");
		
		Pepsi p = (Pepsi) con.getBean("pep");
//		System.out.println(p);

		
//		System.out.println("==============================================");
		
	
		Pastre pas = (Pastre) con.getBean("pastre");
		System.out.println(pas);
		
		con.registerShutdownHook();  // ye container me destroy method ko call krne ka kaam krta
	// AbstractApplicationContext is parent interface which give registrationShutdownHook method
	}
}



/*
// Bean life cycle in Java Spring

Bean life cycle is managed by the spring container. When we run the program then, first of all, the spring container gets started.
 After that, the container creates the instance of a bean as per the request, and then dependencies are injected.
 And finally, the bean is destroyed when the spring container is closed.


- Spring provide two important methods to every bean

public void init()
public void destroy()

Note: We can choose custom method name instead of init() and destroy(). Here, we will use init() method to execute all its code
      as the spring container starts up and the bean is instantiated, and destroy() method to execute all its code on closing 
      the container. 


// Ways to implement the life cycle of a bean
- Spring provides three ways to implement the life cycle of a bean. 
1) XML
2) Spring Interface
3) Annotation


*/








