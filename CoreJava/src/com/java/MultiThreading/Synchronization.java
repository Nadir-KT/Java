package com.java.MultiThreading;

public class Synchronization extends Thread {
	/* Synchronization is the capability to control the access of multiple threads to any shared resources.
	 * 1) Process Synchronization: It means sharing system resources by processes in a such a way that, 
	 * Concurrent access to shared data is handled thereby minimizing the chance of inconsistent data.
	 * 2) Thread Synchronization
	 * 2.1 Mutual Exclusive (only 1 option from below is required for Synchronization)
	 * 2.1.1 Using synchronized method
	 * 2.1.2 Using synchronized block
	 * 2.1.3 Static synchronization
	 * 2.2 Inter-thread Communication--(Cooperation)
	 */
	synchronized void Reource0(int n) //2.1.1 synchronized method
	//static synchronized void Reource0(int n) //2.1.3 Static synchronized method
	//void Reource0(int n) //2.1.2 unsynchronized method
	{
		/* synchronized(this) //2.1.2 unsynchronized method with synchronized block
		{
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		} */
		// unsynchronized block
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Synchronization s1=new Synchronization();
		Thread1 t1=new Thread1(s1);
		Thread2 t2=new Thread2(s1);
		t1.start();
		t2.start();
	}

}
