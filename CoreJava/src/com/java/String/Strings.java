package com.java.String;

public class Strings
{
	/*
	public char charAt(int index)
	public int compareTo(String anotherString)
	public boolean contains(CharSequence sequence)
	public boolean endsWith(String suffix)
	public boolean equals(Object anotherObject) //Object class //String class
	public byte[] getBytes()
	int indexOf(char ch)
	int indexOf(String arg)
	int indexOf(char arg, int from index)
	int indexOf(String arg, int from index)
	public boolean isEmpty()
	public int length()
	public String replace(char oldChar, char newChar)
	public String substring(int startIndex) //type - 1
	public char[] toCharArray()
	public String toLowerCase()
	public String toUpperCase()
	public String trim() 
	*/
	
	public static void main(String[] args)
	{
		String s1="75#41*java is a language";//java.lang
		String s2="python";
		String s3="   python";
		System.out.println(s1.charAt(0));
		System.out.println(s1.compareTo(s2));//Compare gap b/w first letters
		System.out.println(s1.contains("java"));//True or False
		System.out.println(s1.endsWith("language"));//True or False
		System.out.println(s1.equals(s2));//True or False
		byte[] arr=s1.getBytes();//ASCII
		System.out.println(arr[0]);
		System.out.println(s1.indexOf("va"));//Array index (Starting) 
		//Array index starts from 0 and Array length starts from 1
		System.out.println(s1.indexOf('a',3));//indexOf(char arg, int from index)
		System.out.println(s1.isEmpty());//True or False
		System.out.println(s1.length());//Array length
		System.out.println(s2.replace("py","mara"));//replace(char oldChar, char newChar)
		System.out.println(s1.substring(5,9));//substring(int startIndex,int endIndex)
		char[] array=s1.toCharArray();//Character Array
		System.out.println(array[0]);
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3);
		System.out.println(s3.trim());
	}
}
