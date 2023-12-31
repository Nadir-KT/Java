package com.java.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;


public class Queue {

	public static void main(String[] args) {
		// Data Structure is a way to store and organize data so that it can be used efficiently.
		// Data Structure: Array, ArrayList, LinkedList, Stack->LIFO(LastInFirstOut), Queue->FIFO(FirstInFirstOut)
		// Queue: LinkedList, PriorityQueue
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(1);
		l1.add(3);
		l1.add(7);
		l1.add(10);
		System.out.println(l1); // FIFO
		// public Object peek() // it returns head element
		// peek returns null if queue is empty
		// public Object element() // same as peek
		System.out.println(l1.peek());
		System.out.println(l1.element());
		//public Object poll // return and remove head element, also returns [] if queue is empty
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		//public boolean offer(Object element) // For adding elements
		l1.offer(500);
		System.out.println(l1);
		
		PriorityQueue p1=new PriorityQueue();
		p1.add(5);
		p1.add(1);
		p1.add(3);
		p1.add(7);
		p1.add(10);
		System.out.println(p1); // Priority based Algorithms for peak element
		System.out.println(p1.peek()); // Natural Ordering for first element
		System.out.println(p1.poll());
		System.out.println(p1.poll());
	}

}
