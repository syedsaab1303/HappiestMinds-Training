package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // dependency injection       
 ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/config.xml");
        
 Student student1 = (Student) context.getBean("student1");
 System.out.println(student1);
 
 
 
 Student student2 = (Student) context.getBean("student2");
 System.out.println(student2);
 
 Student student3 = (Student) context.getBean("student3");
 System.out.println(student3);
    }
}

/* 

// Spring Framework
- Spring is a Dependency Injection framework to make the java application loosely coupled. It provides support to various frameworks such as  Hibernate,

// Advantages of Spring Framework
1) Predefined Templates
- Spring framework provides templates for JDBC, Hibernate, JPA etc. technologies. So there is no need to write too much code.

2) Loose Coupling
- The Spring applications are loosely coupled because of dependency injection.

3) Easy to test

// Dependency Injection
- It is a design pattern.

// Advantage of Dependency Injection
1) makes the code loosely coupled so easy to maintain
2) makes the code easy to test

// IoC
- Spring container is one of the component of spring framework.
- It create an object
- If object create then it hold the object in memory
- It inject one object into the another Object
- Means it maintain the life cycle of object from creation to destruction.

- It want beans(POJOs) class and XML Configuration.

There are two types of IoC containers. They are:

1) BeanFactory
2) ApplicationContext

// Using ApplicationContext
- The ClassPathXmlApplicationContext class is the implementation class of ApplicationContext interface. We need to instantiate the ClassPathXmlApplicationContext class to use the ApplicationContext as given below:

ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  

- There are some classes of ApplicationContext such as  ClassPathXmlApplicationContext , AnnotationConfigApplicationContext , FileSystemXmlApplicationContext


Configuration File :- It is an XML file where we declare beans and its dependency.




*/










