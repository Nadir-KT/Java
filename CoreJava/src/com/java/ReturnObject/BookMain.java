package com.java.ReturnObject;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookCreator b1=new BookCreator();
		Book b2=b1.createNewBook();
		b2.display();
	}

}
