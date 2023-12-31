package com.java.MultiThreading;//17:05
/* A Thread can be created in Java in the following ways:
 * 1. By Extending Thread class
 * 2. Implementing Runnable interface
 */
//public class MultiThreading implements Runnable
public class MultiThreading extends Thread {
	//public void run()
	public void run() {
		System.out.println("Run method started");
		for(int i=1;i<=5;i++) {
			//public static Thread currentThread()
			System.out.println(Thread.currentThread().getName());
			System.out.println("Current Priority = "+Thread.currentThread().getPriority());
			System.out.println(i);
		}
		try {
			//public static sleep() – Stop the thread for the specified time.
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Run method ended");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		/* MultiThreading: Executing multiple programs concurrently
		 * Thread: Independent path of execution
		 * MultiThread Creation:- 
		 * 1. by overriding run() of Thread class
		 * 2. by implementing run() of java.lang.Runnable Interface
		 * Default Threads:-
		 * 1. Main Thread (User Thread / non Daemon Thread) // JRE
		 * 2. Garbage Collector Thread // protected Object finalize() // Automatic (Daemon Thread)
		 * 3. Thread Scheduler
		 */
		/* Thread Life Cycle : https://beginnersbook.com/2013/03/thread-life-cycle-in-java/
		 * Threads can go through five different status in its life cycle as shown below.
		 * 1. New: A new thread is created but not working. A thread after creation and before invocation of start() method will be in new state.
		 * 2. Runnable: A thread after invocation of start() method will be in runnable state. A thread in runnable state will be available for thread scheduler.
		 * 3. Running: A thread in execution after thread scheduler select it, it will be in running state.
		 * 4. Blocked: A thread which is alive but not in runnable or running state will be in blocked state. A thread can be in blocked state because of suspend(), sleep(), wait() methods or implicitly by JVM to perform I/O operations.
		 * 5. Dead: A thread dies naturally when the run() method exits. We can use stop() method to forcefully kill a thread.
		 */
		/* Methods of ThreadClass
		 * public void getState() – It returns the state of the thread.
		 * final boolean isAlive() – Check if the thread is alive.
		 */
		MultiThreading t1=new MultiThreading();
		MultiThreading t2=new MultiThreading();
		MultiThreading t3=new MultiThreading();
		try {
			//public void join() // wait for a thread to die
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//public void getName() – It returns the name of the thread.
		System.out.println(t1.getName());
		//public void getPriority() – It returns the priority of the thread.
		System.out.println("Current Priority = "+Thread.currentThread().getPriority());
		//public long getId()
		System.out.println(t1.getId());
		//public void start() – Starts the thread.
		t1.start();
		t2.start();
		t3.start();
		//public void interrupt()
		t1.interrupt();
		//public void stop()
		t2.stop();
		System.out.println("main ended");
		/* Thread Scheduling & Thread Priority
		 * Fixed Priority Algorithms
		 * FIFO
		 */
		t1.setPriority(MAX_PRIORITY);
		//public final void setPriority(int newPriority)
		System.out.println("Thread Priority = "+t1.getPriority());
	}
	//Constants for Thread Priority
	public final static int MIN_PRIORITY=1;
	public final static int NORM_PRIORITY=5;
	public final static int MAX_PRIORITY=10;

}