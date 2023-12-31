package com.java.MultiThreading;

public class DeadLock {
	/* Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
	 * A Deadlock is a situation where each of the computer process waits for a resource which is being assigned to some another process. 
	 * In this situation, none of the process gets executed since the resource it needs, is held by some other process which is also waiting for some other resource to be released.
	 * And, none is able to leave the lock on the resource it is holding. Therefore, none of the processes gets executed.
	 * In a communications system, deadlocks occur mainly due to loss or corruption of signals rather than contention for resources.
	 * 
	 * Necessary conditions for Deadlocks:- https://www.tutorialspoint.com/process-deadlocks-in-operating-system
	 * 1. Mutual Exclusion: A resource can only be shared in mutually exclusive manner. It implies, if two process cannot use the same resource at the same time.
	 * 2. Hold and Wait: A process waits for some resources while holding another resource at the same time.
	 * 3. No Preemption: The resource will be released only after the execution of thread is completed.
	 * 4. Circular Wait: This condition occurs when each thread is waiting for a resource held by the preceding one and the last thread is waiting for a resource held by first thread.
	 * 
	 * A deadlock in a program can be prevented if any of the four conditions are not met. They are:
	 * 1. Mutual Exclusive Condition: If every resource is shared by multiple threads, deadlock would never occur.
	 * 2. Hold and Wait Condition: This condition can be eliminated when a thread is prohibited to wait for more resources while already holding a certain resource. It can be achieved when we declare all resources at the very beginning that are expected to use by a thread.
	 * 3. No Preemption Condition: This condition can be eliminated if a thread holding a certain resource is denied for further request. That thread must unlock its original resource. If necessary request them again together with additional resource.
	 * 4. Circular Wait Condition: This is the easiest way to avoid deadlock than the above three. There are two ways to eliminate deadlock.
	 * 4.1 First way: It can be achieved if a thread is to force to hold only one resource at a time. If it needs another resource, it must first release that resource that is held by it and then requests another.
	 * 4.2 Second way: It can be achieved by acquiring resources (locks) in a specific order and releasing them in reverse order so that a thread can only continue to acquire a resource if it held the other one.
	 * 
	 * Deadlocks cannot be completely resolved. It depends on the logic used by the programmer. But we can avoid them by following basic rules mentioned below:
	 * 1. Avoid Nested Locks: We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.
	 * 2. Avoid Unnecessary Locks: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
	 * 3. Using Thread Join: A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.
	 */
	String s1="Resource 1";
	String s2="Resource 2";
	
	Thread t0=new Thread() {
		@Override
		public void run() {
			synchronized (s1) {
				try {
					System.out.println(Thread.currentThread().getName()+" locked "+s1);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+" locked "+s2);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	
	Thread t1=new Thread() {
		@Override
		public void run() {
			synchronized (s2) {
				System.out.println(Thread.currentThread().getName()+" locked "+s2);
				synchronized (s1) {
					System.out.println(Thread.currentThread().getName()+" locked "+s1);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	/*//The pattern of accessing the resources 1 and 2, is main issue. So, to solve it, re-order the statements where the code is accessing shared resources.
	Thread t1=new Thread() {
		@Override
		public void run() {
			synchronized (s1) {
				System.out.println(Thread.currentThread().getName()+" locked "+s1);
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+" locked "+s2);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	*/
	public static void main(String[] args) {
		DeadLock d1=new DeadLock();
		d1.t0.start();
		d1.t1.start();
	}
}
