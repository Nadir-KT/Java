package com.java.MultiThreading;

public class InterThreadMain {

	public static void main(String[] args) {
		/* Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.
		 * Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
		 * A critical section is a code segment that can be accessed by only one process at a time.
		 * Inter-thread communication in Java can be achieved by using three methods provided by Object class of java.lang package. They are:
		 * 2.2.1 public void wait(): Causes the current thread to wait until another thread wakes it up by calling notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
		 * 2.2.2 public void notify(): Wakes up the first thread that called wait() on the same object.
		 * 2.2.3 public void notifyAll(): Wakes up all the threads that called wait( ) on the same object.
		 */
		InterThreadCom i1=new InterThreadCom();
		Thread t1= new Thread() {
			public void run() {
				i1.withdraw(7000);
			}
		};
		Thread t2= new Thread() {
			public void run() {
				i1.deposit(5000);
			}
		};
		t1.start();
		t2.start();
	}

}
