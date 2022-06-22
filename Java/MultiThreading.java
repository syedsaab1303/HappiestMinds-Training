package com.training;



/*
// Multithreading in Java
- Multithreading in Java is a process of executing multiple threads simultaneously.
- A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
- However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate  separate memory area so saves memory,
   and context-switching between the threads takes less time than process.
- Java Multithreading is mostly used in games, animation, etc.


// Life cycle of a Thread (Thread States)
- In Java, a thread always exists in any one of the following states. These states are:

1) New
2) Active
3) Blocked / Waiting
4) Timed Waiting
5) Terminated

// Explanation of Different Thread States
New: Whenever a new thread is created, it is always in the new state. For a thread in the new state, the code has not been run yet and thus has not begun its execution.

Active: When a thread invokes the start() method, it moves from the new state to the active state. The active state contains two states within it:
        one is runnable, and the other is running.

Runnable: A thread, that is ready to run is then moved to the runnable state. In the runnable state, the thread may  be running or may be ready to run at any
          given instant of time. It is the duty of the thread scheduler to  provide the thread time to run, i.e., moving the thread the running state.
          
A program implementing multithreading acquires a fixed slice of time to each individual thread. Each and every thread runs for a short span of time and when that
allocated time slice is over, the thread voluntarily gives up the CPU to the other thread, so that the other threads can also run for their slice of time.
Whenever such a scenario occurs, all those threads that are willing to run, waiting for their turn to run, lie in the runnable state. In the runnable state,
there is a queue where the threads lie.

Running: When the thread gets the CPU, it moves from the runnable to the running state. Generally, the most common change in the state of a thread is from runnable 
        to running and again back to runnable.Blocked or Waiting: Whenever a thread is inactive for a span of time (not permanently) then, either the thread is
	in the  blocked state or is in the waiting state.



// For example, a thread (let's say its name is A) may want to print some data from the printer. However, at the same time,  the other thread (let's say its name is B) 
  is using the printer to print some data. Therefore, thread A has to wait for thread B to use the printer. Thus, thread A is in the blocked state. A thread in the
  blocked state is unable to perform any execution and thus never consume any cycle of the Central Processing Unit (CPU). Hence, we can say that thread A remains
  idle until the thread scheduler reactivates thread A, which is in the waiting or blocked state.

 When the main thread invokes the join() method then, it is said that the main thread is in the waiting state. The main thread then waits for the child threads to 
 complete their tasks. When the child threads complete their job, a notification is sent to the main thread, which again moves the thread from waiting to the active state.

If there are a lot of threads in the waiting or blocked state, then it is the duty of the thread scheduler to determine which thread to choose and which one to reject,
and the chosen thread is then given the opportunity to run.


- Timed Waiting: Sometimes, waiting for leads to starvation. For example, a thread (its name is A) has entered the critical section of a code and is not willing to
  leave that critical section. In such a scenario, another thread (its name is B) has to wait forever, which leads to starvation. To avoid such scenario, a timed
  waiting state is given to thread B. Thus, thread lies in the waiting state for a specific span of time, and not forever. A real example of timed waiting is when 
  we invoke the sleep() method on a specific thread. The sleep() method puts the thread in the timed wait state. After the time runs out, the thread wakes up and
  start its execution from when it has left earlier.

- Terminated: A thread reaches the termination state because of the following reasons:

- When a thread has finished its job, then it exists or terminates normally.

- Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.

- A terminated thread means the thread is no more in the system. In other words, the thread is dead, and there is no way one can respawn (active after kill) the dead thread.

// Java Threads 
There are two ways to create a thread:

1) By extending Thread class
2) By implementing Runnable interface.

*/

// Create a thread by Thread class

class test123 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread task");
		System.out.println(Thread.currentThread().isAlive()); // true
	}
}

public class MultiThreading{
		public static void main(String[] args) 
	{
		test123 t = new test123();
		t.start();
	
		System.out.println(Thread.currentThread().isAlive());

//	System.out.println(t.isAlive()); // ye dead state me jaane ke baad false value return krega

	}
}
/*
output:
	true
	Thread-0
	Thread task
	true
*/


// Join thread

class Medical extends Thread {

	public void run() {

		try {
			System.out.println("Medical Starts");
			Thread.sleep(3000);
			System.out.println("Medical completed");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}


class TestDriver extends Thread {

	public void run() {

		try {
			System.out.println("Test Driving Starts");
			Thread.sleep(4000);
			System.out.println("Test Driving completed");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}


class OfficerSign extends Thread {

	public void run() {

		try {
			System.out.println("Officer takes  the file");
			Thread.sleep(3000);
			System.out.println("officer works completed");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}


 class JoinThread {

	public static void main(String[] args) throws InterruptedException {
	
		Medical medi = new Medical();
		medi.start();
		
		medi.join();   // medical thread ka code execute krega and main thread wait krega
	//	(main thread me TestDrive and OfficerSign hai)
		
		TestDriver td = new TestDriver();
		td.start();
		 
		td.join();  // TestDriver thread and Medical thread ka code execute krega
// (pehle medical thread ka code execute then testDriver ka code if medi.join() lgaya hai hmne tb)
	// aur main thread wait krega( yha main thread me  OfficerSign hai) 
		
		OfficerSign os = new OfficerSign();
		os.start();

	//	os.join();
	}

}
/*
 * output
 Medical Starts
Medical completed
Test Driving Starts
Test Driving completed
Officer takes  the file
officer works completed
 */


 
// Interrupted isInterrupted

  class Interrupted_isInterrupted  extends Thread{

 	public void run()
 	{
 		System.out.println(Thread.interrupted());  // ye status true se false krega mgr false se true nhi
 		System.out.println(Thread.interrupted());
 		System.out.println(Thread.interrupted());
 	    // Thread.interrupted() method status btayega aur  status agar true hai to false kr  dega  

 		System.out.println(Thread.currentThread().isInterrupted());		
 		try {
 			for(int i=0; i<=5; i++)
 			{
 				System.out.println(i);
 			Thread.sleep(1000);
 // ii.interrupt() nhi hoga to ye for loop shi se work krega
 // ii.interrupt()  hoga to ye for loop shi se work nhi krega bs 1 print krakr 
 			//fir catch me chale j ayega
 		
 			}
 			
 			
 		}
 		catch(Exception e) {
 			System.out.println("Thread Interrupted" + e );
 		}
 		
 	}
 	
 	public static void main(String[] args) {
 	
 		Interrupted_isInterrupted ii = new Interrupted_isInterrupted();
 		ii.start();
 		ii.interrupt();
 		
 	}

 }

/*
 * output
true
false
false
false
0
1
2
3
4
5

 */
 
  
