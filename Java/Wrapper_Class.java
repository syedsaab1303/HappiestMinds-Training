package com.training;

/*
//Wrapper classes in Java
- The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

- Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. 
  The automatic conversion of primitive  into an object is known as autoboxing and vice-versa unboxing.


//Use of Wrapper classes in Java
- Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization,
  Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.

1) Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value,
   we can convert it in objects through the wrapper classes.
2) Synchronization: Java synchronization works with objects in Multithreading.
3) java.util package: The java.util package provides the utility classes to deal with objects.
4) Collection Framework: Java collection framework works with objects only. All classes of the collection framework 
   (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

- The eight classes of the java.lang package are known as wrapper classes in Java.
- The list of eight wrapper classes are given below:

Primitive Type			Wrapper class

1) boolean			 Boolean
2) char			         Character
3) byte				 Byte
4) short			 Short
5) int				 Integer
6) long				 Long
7) float			 Float
8) double			 Double

Method to be remember:
1) intValue()
2) valueOf()

//Autoboxing
- The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
- for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean,
  double to Double, and short to Short.

*/
// Wrapper class Example: Primitive to Wrapper

public class Wrapper_Class{  
public static void main(String args[]){  
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer explicitly

Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  

System.out.println(a+" "+i+" "+j);  
}}  
/*Output:

20 20 20


//Unboxing
- The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. 
- It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes to
   convert the wrapper type into primitives.
*/

// Wrapper class Example: Wrapper to Primitive

 class WrapperExample2{    
public static void main(String args[]){    
//Converting Integer to int    
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  

int j=a;//unboxing, now compiler will write a.intValue() internally    
 
System.out.println(a+" "+i+" "+j);    
}}    
/*Output:

3 3 3


//Custom Wrapper class in Java
- Java Wrapper classes wrap the primitive data types, that is why it is known as wrapper classes. We can also create a 
  class which wraps a primitive data type. So, we can create a custom wrapper class in Java.

  */ 
   


