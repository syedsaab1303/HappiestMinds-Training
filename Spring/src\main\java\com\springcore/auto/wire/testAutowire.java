//autowiring in spring through xml 

package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/auto/wire/Autowireconfig.xml");
		
		Employee emp = con.getBean("emp", Employee.class);		//bcoz of this way of writing "emp" there is no typecasting
		
		System.out.println(emp);
	
        Employee emp1 = con.getBean("emp1", Employee.class);
		
		System.out.println(emp1);
	
		
		 Employee emp2 = con.getBean("emp2", Employee.class);
			
			System.out.println(emp2);
	}

}



/*

 // Autowiring in Spring
1) It is a feature of spring framework in which spring container inject the dependencies automatically.
2) Autowiring can't be used to inject primitive and string values. It works with Object (reference) only.
 
  
// autowiring in spring through xml 
  Autowiring Modes
  1) no
  2) byName
  3) byType
  4) constructor
  5) autodetect (It is depricated since spring 3)
  
  
 // autowiring in spring through Annotation
    @Autowired
   
   
 // Autowiring Advantages
   1) Automatic
   2) less code
   
   
 //  Autowiring Disadvantages
   
   1) No control of programmer.
   2) It can't be used for primitive and string values.
   
 */