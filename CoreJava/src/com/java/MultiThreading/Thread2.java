package com.java.MultiThreading;

public class Thread2 extends Thread {
	Synchronization t;

	public Thread2(Synchronization t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		t.Reource0(100);
	}
}
