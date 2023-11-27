package com.java.MultiThreading;

public class Thread1 extends Thread {
	Synchronization t;

	public Thread1(Synchronization t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		t.Reource0(5);
	}
}
