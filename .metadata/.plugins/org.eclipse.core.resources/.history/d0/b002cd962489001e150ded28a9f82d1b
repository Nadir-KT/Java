package com.java.Array;

public class LinkedList 
{
	private Node start;//start address
	private Node last;//last address
	private int count;
	
	public void add(Object ele) // For adding element
	{
		if (start==null) {
			start=new Node(ele);
			last=start;
		}
		else {
			last.next=new Node(ele);
			last=last.next;
		}
		
	}
	public int size() // For checking size
	{
		return count;
	}
	public Object get(int index) // For getting index
	{
		if(index>size())
			throw new IndexOutOfBoundsException();
		Node p=start;
		for(int i=1;i<=index;i++) {
			p=p.next;
		}
		return p.element;
	}
	
	@Override
	public String toString() // For printing array in String
	{
		if(size()==0)
			return "[]";
		String s="["+start.element;
		Node p=start;
		while(p.next!=null)
		{
			p=p.next;
			s=s+","+p.element;
		}
		return s+"]";
	}

	class Node {
		Object element;
		Node next; // address
		Node(Object ele)
		{
			element=ele;
			count++;
		}
	}

}