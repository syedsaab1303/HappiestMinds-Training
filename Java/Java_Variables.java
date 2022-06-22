package com.training;

//A Java variable is a piece of memory that can contain a data value. A variable thus has a data type.
//Variables are typically used to store information which your Java program needs to do its job.

public class Java_Variables{
 int a=10;     //  instance variable
 static int b=20;   // static variable

public static void main(String[] args)
{
  Java_Variables jv = new  Java_Variables();
     int z=50; // local variable

//   System.out.println(a);         // non static variable a cannt be referenced from a static context
   System.out.println(jv.a);
   System.out.println(b);
  // System.out.println(jv.b);

}
}


/**
Local Variable

1) Declaration:-  inside method , constructor or block.
2) scope:- inside method , constructor or block  not outside.
3) When variable  get allocated:- when method , constructor or block gets executed variables allocated memory when gets exits variables destroyed. 
4) Stored memory:- Stack memory
5) default values:- does not have any default value , value should be provided before use.
6) Access specifier:- cannot be used with local variable.


Instance Variable
1) Declaration:-  inside class but outside method , constructor or block.
2) scope:- inside all method , constructor or block within a class (not inside the static method directly). 
3) When variable  get allocated:- when object is created variables allocated memory when objects gets destroyed variables release memory. 
4) Stored memory:- heap memory
5) default values:- They have default value like int=0 , boolean =false, object=null.
6) Access specifier:- can be used.


3) Static variable
1) Declaration:-  with static keyword inside a class but outside method , constructor or block.
2) scope:- similar to instance variable i.e. inside all method , constructor or block including static. 
3) When variable  get allocated:- when we run program and .class file is loaded , variable allocated  when .class file unloaded variable gets destroyed . 
4) Stored memory:- non-heap memory or static memory.
5) default values:- similar to instance variable.
6) Access specifier:- can be used.
7) How to access:-a) directly
               b) by using class name
               c) by using object reference name.
*/





