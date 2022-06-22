package com.training;
import java.util.*;  

/*
 
   List,Array List, LinkedList, Vector ,  Set, Queue, , Hash table, Map, Hash Map, Tree Set, TreeMap
		Sorting Collections, Comparable and Comparator

 */






/*

// Collections in Java

- The Collection in Java is a framework.
- Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
- It is a single entity or object which can store multiple date.
- 

// What is a framework in Java
- It provides readymade architecture.
- It represents a set of classes and interfaces.


// What is Collection Framework(API) , Collection and Collections ?
  Collection Framework is an API which contains predefined classes and interfaces while Collection is an Interface present in java.util package, it is the root interface of all the collection objects.
  and Collections is the utility class which contains only static methods.
  
  
  
//  Interface			           Description													      Derived classes 

1) Collection :-	It is a root interface . It comes with methods that define basic operations	    Majority of the classes 
2) List	:- 			Subclasses allow duplicate elements 											LinkedList, ArrayList, Vector
3) Set :- 			Subclasses does not allow duplicate elements 									HashSet, LinkedHashSet
4) SortedSet :-		It prints the elements in ascending order implicitly.
 					Being sub interface of Set, it allows only unique elements 						TreeSet
 					
5) Map :- 			Allows the subclasses to store key/value pairs. Does not allow duplicate keys. 	HashMap, LinkedHashMap, Hashtable
6) SortedMap :-     Prints elements in ascending order of keys.
 					Being a sub interface of Map, it will not allow duplicate keys					TreeMap


// Traversing collections
- 2 ways to traverse:
1) Enhanced for loop
2) Iterators 

1) enhanced for loop
   for(object o:collection)
    SOP(o);

Ex:   
     Collection <String> c= new ArrayList <String> ();
      for(String  s :  c)
            System.out.println(" "+s);


2) Iterator
- An Iterator is an interface that enables us to traverse through a collection.
- We can use iterator for a collection by calling its iterator() method. 

    Iterator it= listName.Iterator();
   Ex:  Iterator it= c.iterator();
 		while(it.hasNext())
       	      System.out.println(it.next());

// Iterator Methods

1) hasNext()-  returns true if the iteration has more elements
2) next()-  returns next element.
3) remove()-  it is called only once per call to next() method else it throws exception


// List Iterator
- used to traverse the list in backward and forward direction.
- It is available for the classes which implements List interface

// Methods used are:
1) public interface ListIterator<E> extends Iterator<E> {
2) public boolean hasNext();
3) public Object next();
4) public boolean hasPrevious();
5) public Object previous();
6) public int nextIndex();
7) public int previousIndex();
8) public Void remove();
9) public void add(Object o);



// List Interface

- List interface is the child interface of Collection interface. It inhibits a index based data structure in which we can store the ordered collection of objects. 
- It can have duplicate values.
- Maintains insertion order.
- List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
- We can iterate(get) the list elements by Iterator and ListIterator. 

// To instantiate the List interface, we must use :

1) List <data-type> list1= new ArrayList();  
2) List <data-type> list2 = new LinkedList();  
3) List <data-type> list3 = new Vector();  
4) List <data-type> list4 = new Stack();  



// ArrayList
- The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
- The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.
*/

public class Java_Collections{  
public static void main(String args[]){  
List<String> list=new ArrayList<String>(); 
list.add("Ravi");
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator<String> itr = list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}    
}

/*
// LinkedList
 
- LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. 
- It can store the duplicate elements. It maintains the insertion order and is not synchronized. 
- In LinkedList, the manipulation is fast because no shifting is required.

*/


class TestJavaCollection2{  
public static void main(String args[]){  
List<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  

Iterator<String> itr = al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}  
  
}  


/*
// Vector
 
- Vector uses a dynamic array to store the data elements. It is similar to ArrayList. 
- However, It is synchronized and contains many methods that are not the part of Collection framework.

*/
class TestJavaCollection3{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr = v.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}  
 
}
}



/*
// Stack
- The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
- The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

*/

class TestJavaCollection4{  
public static void main(String args[])
{  
Stack<String> stack = new Stack<String>();  
stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  
stack.pop();  
Iterator<String> itr = stack.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
   }  
 }  
  
}


/*
//  ArrayList   v/s LinkedList
1) Search: AL searching is pretty faster than the LL  since AL will do index based searching like arrays where as LL has to traverse through all the nodes
2) Insertion  :LL insertion is faster than AL since in AL inserting at any point needs to rearrange all the other elements , to fill the space where as LL has 2 pointers, with neighborhood elements so during insertion, only 2 pointers have to be adjusted
3) Deletion : LL deletion is faster than AL
4) Memory overhead: Al has only data but LL has data and pointers in it.
 
  
 */

/*
// Queue Interface
- Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed.
- There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

// Queue interface can be instantiated as:

1) Queue<String> q1 = new PriorityQueue();  
2) Queue<String> q2 = new ArrayDeque();  
- There are various classes that implement the Queue interface, some of them are given below.

1) PriorityQueue
- The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. 
- PriorityQueue doesn't allow null values to be stored in the queue.
*/
class TestJavaCollection5{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  
/*
Output:

head:Amit Sharma
head:Amit Sharma
iterating the queue elements:
Amit Sharma
Raj
JaiShankar
Vijay Raj
after removing two elements:
Raj
Vijay Raj


2) Deque Interface
- Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side.
- Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

// Deque can be instantiated as:

Deque d = new ArrayDeque();  

3) ArrayDeque
- ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. 
- Unlike queue, we can add or delete the elements from both the ends.

- ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
*/
class TestJavaCollection6{  
public static void main(String[] args) {  
//Creating Deque and adding elements  
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Gautam");  
deque.add("Karan");  
deque.add("Ajay");  
//Traversing elements  
for (String str : deque) {  
System.out.println(str);  
}  
}  
} 
/*
Output:

Gautam
Karan
Ajay

*/

































































































