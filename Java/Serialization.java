package com.training;
import java.io.*; 
import java.io.Serializable; 
/*
// Serialization and Deserialization
- There is a data inside the object and we have to store the data into file this is called serilization and if we restore
  the data from file to object this is called deserialization.
-  we have to store the condition of object  into file and restored from file to object
- for  eg youtube ,music player.
- we watch youtube video or listen music , if sudden work come so we pause the youtube video or  music and when we come
  back then we start our video or audio in the same time this is the example of serialization
 
- It is mainly used in Hibernate,  JPA  technologies.
- The serialization and deserialization process is platform-independent, it means you can serialize an object on one
  platform and deserialize it on a different platform.

- For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the
   readObject() method of ObjectInputStream class.
- We must have to implement the Serializable interface for serializing the object.
- Serializable is a marker interface 



// ObjectOutputStream class
- The ObjectOutputStream class is used to write primitive data types, and Java objects to an ObjectOutputStream.

// ObjectInputStream class
- An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.


// Example of Java Serialization
*/

import java.io.Serializable;  
 class Student implements Serializable{  
 int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  
   
public class Serialization{    
 public static void main(String args[]){    
  try{    
  //Creating the object    
  Student s1 =new Student(211,"ravi");    
  //Creating stream and writing the object    
  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
     
  //closing the stream    
  out.close();    
  System.out.println("success");    
  }catch(Exception e)
  {
	  System.out.println(e);
	  }    
 }

public String id1;
public String name1;    
}   
/*
Output:
success


// Example of Java Deserialization

*/
  /*
class Student2 implements Serializable{  
int id1;  
String name1;  
public Student2(int id, String name) {  
 this.id1 = id;  
 this.name1 = name;  
}  
}  
class Depersist{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
	  FileInputStream fin =   new FileInputStream("f1.txt");
  ObjectInputStream oij=new ObjectInputStream(fin);  
  Serialization s=(Serialization)oij.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.id1+" "+s.name1);  
  //closing the stream  
  fin.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}
*/
/*
Output:

211 ravi
*/

