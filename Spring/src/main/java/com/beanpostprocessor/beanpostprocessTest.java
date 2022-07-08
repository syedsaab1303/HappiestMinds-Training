package com.beanpostprocessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanpostprocessTest {

   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanpostprocessor/beanpostprocessConfig.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}

/*	
		Bean PostProcessors are classes that tells spring that there are some processing that spring needs to do after initializing the bean hence the name bean post processors
		
		We want framework to do something to perform some actions after being initializations then we write a bean post processor and then spring execute that piece of code when every bean is initialized 		
		
		Some Singnificant points of bean post processor:-
		1)Single method runs for every initialization of every bean in your spring.
		
		2) Bean post processor is a seperate class because it create us to initializations of different types of classes.
		
*/