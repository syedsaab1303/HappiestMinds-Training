package com.training;

/*
// Java Inner Classes (Nested Classes)
- Java inner class or nested class is a class that is declared inside the class or interface.
- We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.
- Additionally, it can access all the members of the outer class, including private data members and methods.

Syntax of Inner class
class Java_Outer_class{  
 //code  
 class Java_Inner_class{  
  //code  
 }  
}  


// Advantage of Java inner classes
- There are three advantages of inner classes in Java. They are as follows:

1) Nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private.
2) Nested classes are used to develop more readable and maintainable code.
3) Code Optimization: It requires less code to write.

// Need of Java Inner class
- Sometimes users need to program a class in such a way so that no other class can access it. Therefore, it would be better if you include it within other classes.



// Java Anonymous inner class
- Java anonymous inner class is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when 
   making an instance of an object with certain "extras" such as overloading methods of a class or interface, without having to actually subclass a class.

// Java Anonymous inner class can be created in two ways:

1) Class (may be abstract or concrete).
2) Interface

*/
// Example

abstract class Person{  
  abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p=new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  
/*
Output:
nice fruits

 */
// Java anonymous inner class example using interface

interface Eatable{  
 void eat();  
}  
public class Java_Inner_Class{  
 public static void main(String args[]){  
 Eatable e=new Eatable(){  
  public void eat(){System.out.println("nice fruits");}  
 };  
 e.eat();  
 }  
}  
/*
Output:

nice fruits


*/

