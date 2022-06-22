package com.training;

import java.io.*;

/*

// Java I/O Tutorial
- Java I/O (Input and Output) is used to process the input and produce the output.
- Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
- We can perform file handling in Java by Java I/O API.


// Stream
- A stream is a sequence of data. In Java, a stream is composed of bytes. It's called a stream because it is like a stream of water that continues to flow.

- In Java, 3 streams are created for us automatically. All these streams are attached with the console.

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err: standard error stream


// Internal Work

- Source is text file / cmd / networking application such as socket
- Read Operatoin is performed by InputStream
- Source + Read Operation = Reading of file or file input
- OutputStream is done by Write Operation
- Destinaton - file, console, socket


Source  ----->  Read Operation (0101010) ----->  Java Appliation  ------> Output Stream  (010101)  -----> Destination


// OutputStream class
- OutputStream class is an abstract class. It is the superclass of all classes representing an output stream of bytes.
  An output stream accepts output bytes and sends them to some sink.

- Useful methods of OutputStream
					Method									Description
1) public void write(int) throws IOException		is used to write a byte to the current output stream.
2) public void write(byte[]) throws IOException		is used to write an array of byte to the current output stream.
3) public void flush() throws IOException	    	flushes the current output stream.
4) public void close() throws IOException	   	 	is used to close the current output stream.


// InputStream class
- InputStream class is an abstract class. It is the superclass of all classes representing an input stream of bytes.

- Useful methods of InputStream

					Method									Description
1) public abstract int read()throws IOException			reads the next byte .
2) public int available()throws IOException				returns number of available bytes.
3) public void close()throws IOException				is used to close the current input stream.


// FileInputStream and FileOutputStream
- used to read and write data in a file.
- Prefer this when primitive datatype values are to be written.
- if we use char oriented data then it is prefer to use FileWriter and FileReader class but if we use byte and char then we use FileInputStream and FileOutputStream class



*/
//  Example of FileInputStream Class
public class Java_IO {
	public static void main(String[] args) {
		FileInputStream infile = null;

		try {
			infile = new FileInputStream("a1.txt");
			int b;
			while ((b = infile.read()) != -1) {
				System.out.println((char) b); // ASCII to Char value
			}
			infile.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


//Example of FileOutputStream Class
class Jave_Input {
public static void main(String[] args) {
	FileOutputStream ofile = null;
	byte b1[] = {'A', 'B'};
	
	try {
		ofile = new FileOutputStream("a2.txt");
		ofile.write(b1);
		ofile.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}

/*
// Java BufferedOutputStream and BufferedInputStream class


// Java BufferedOutputStream
- used internal buffer to store data
- fast and more effective
*/

// Example of BufferedOutputStream

class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("f1.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Happiest Minds Training .";    
     byte b[]=s.getBytes();  // convert String into byte    
     bout.write(b);    // 
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  

/*
// Java BufferedInputStream Class
- Java BufferedInputStream class is used to read information from stream.
- It internally uses buffer mechanism to make the performance fast.
*/


class BufferedInputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("f1.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e)
  {
	  System.out.println(e);
  }    
 }    
}  


/*
// FileReader and FileWriter class

- It  is character-oriented class which is used for file handling in java
- It is used to write and read data to a file.

*/
// Example to Read characters from file.

class FileReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("file1.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    
// or
class File1 {  
    public static void main(String args[])throws Exception{ 
    	File infile1= new File("file1.txt");
          FileReader fr=null;    
         try {
        	 fr= new FileReader(infile1);
            int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
         }finally
         {
        	 fr.close();    
         }      
    }    
}    



// Example of FileWriter
  
class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("file1.txt");    
           fw.write("Welcome to the programing world.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
} 


// Example to read from one file and writes its content to another file

/*
class File_Read_Write{
	public static void main(String[] args) {
		File infile = new File("a1.txt");
		File outfile = new File("a2.txt");
		
		FileReader fr= null;
		FileWriter fw = null;
		try {
			fr = new FileReader(infile);
			fw= new FileWriter(outfile);
		int ch;
		while((ch= fr.read())!=-1) {
		fw.write(ch);	
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		finally {
			try {
				fr.close(); 
			fw.close();
			}
		}
	}
}




// Java ByteArrayOutputStream Class
- Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream, the data is written into a byte array which can be written to multiple streams.
*/

 class DataStreamExample {  
public static void main(String args[]) throws Exception{    
      FileOutputStream fout1=new FileOutputStream("f1.txt");    
      FileOutputStream fout2=new FileOutputStream("f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(123);    // write method se 123 value goes into bout object and this bout object call writeTo method means we have to force the value of bout to fout1 and fout2
      bout.writeTo(fout1);    // and  the  internal wroking of fout is to write the value in f1.txt and fout2 write in f2.txt with the help of writeTo method
      bout.writeTo(fout2);    
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
    }   



/*
// Various ways to read data from keyboard

1) using InputStreamReader class
2) Using  Scanner class
3) Using Console class



1) using InputStreamReader class
- it connects the input stream  of keyboard and convert the  byte oriented stream into character oriented stream 
- in this  we use BufferReader class which is  used to read the data line by line using data readline method

*/

class InputStreamReaderExample {  
    public static void main(String[] args) {  
        try  {           
            InputStreamReader reader = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(reader);
            br.readLine();      
            }  
         catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  



/*
// Using Console class
- The Java Console class is be used to get input from console. It provides methods to read texts and passwords.
*/

class ReadPasswordTest{    
public static void main(String args[]){ 
	
Console c=System.console();    
System.out.println("Enter password: ");    
char[] ch=c.readPassword();    
String pass=String.valueOf(ch);//converting char array into string    
System.out.println("Password is: "+pass);    
}    
}  

/*
// Java Scanner
- Scanner class in Java is found in the java.util package. Java provides various ways to read input from the keyboard, the java.util.Scanner class is one of them.

*




// PrintStream class
- The PrintStream class provides methods to write data to another stream. The PrintStream class automatically flushes the data so there is no need to call flush() method. Moreover, its methods don't throw IOException.
*/

// Example of java.io.PrintStream class
// write the content to a file using printstream

class PrintStreamTest{  
 public static void main(String args[])throws Exception{  
   FileOutputStream fout=new FileOutputStream("file.txt");  
   PrintStream pout=new PrintStream(fout);  
   pout.println(1900);  // these value is write in file.txt
   pout.println("Hello Java");  
   pout.println("Welcome to Java");  
   pout.close();  
   fout.close();  
 }  
}   


// Example of printf() method of java.io.PrintStream class:
// format the text using printf method

class PrintStreamTest2{  
 public static void main(String args[]){  
   int a=10;  
   System.out.printf("%d",a);// out is the object of PrintStream class  
      
 }  
}   













































