package com.training;

/*

//Object Cloning in Java
- object cloning is a way to create exact copy of an object. 
- The clone() method of Object class is used to clone an object.
- The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
- If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.


//Why use clone() method ?
-  The clone() method saves the extra processing task for creating the exact copy of an object. If we perform  it by using the new keyword, it will take a
 lot of processing time to be performed that is why we use object cloning.


//Advantage of Object cloning
1) You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4 or 5 line  long clone() method.
2) It is the easiest and most efficient way for copying objects, especially if we are applying it to an already developed or an old project.
3) Clone() is the fastest way to copy array.

//Disadvantage of Object cloning
1) To use the Object.clone() method, we have to change a lot of syntaxes to our code, like implementing a Cloneable interface, defining the clone() 
 method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.
2) If you want to write a clone method in a child class then all of its superclasses should define the clone() method in them. Otherwise, the super.clone() 
 chain will fail.

*/

public class Object_Cloning implements Cloneable{  
int rollno;  
String name;  

Object_Cloning(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  

public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  

public static void main(String args[]){  
try{  
Object_Cloning s1=new Object_Cloning(101,"amit");  

Object_Cloning s2=(Object_Cloning)s1.clone();  

System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  

}catch(CloneNotSupportedException c){}  

}  
}  




