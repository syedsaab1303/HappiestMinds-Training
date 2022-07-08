package com.springcore.beandefinationinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 A bean definition can contain a lot of configuration information, including constructor arguments, property values, and container-specific information such as initialization method, static factory method name, and so on.
 
 A child bean definition inherits configuration data from a parent definition. The child definition can override some values, or add others, as needed.
 
 Spring Bean definition inheritance has nothing to do with Java class inheritance but the inheritance concept is same. You can define a parent bean definition as a template and other child beans can inherit the required configuration from the parent bean.
 
 */
public class BeanDefinationInheritanceTest {

   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beandefinationinheritance/beandefinationinheritanceCOnfig.xml");
      
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.getMessage1();
      objA.getMessage2();

      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
   }
}