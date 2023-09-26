package com.java.String;

//Java program to extract numbers/digits from a string.

import java.util.Scanner;

class ExtractNumberFromString
{
public static void main(String[] args) 
{
    String str;
    String numbers,characters;
     
    Scanner SC=new Scanner(System.in);
     
    System.out.print("Enter string that contains numbers & characters: ");
    str=SC.nextLine();
     
    //extracting string
    numbers=str.replaceAll("[^0-9]", "");//Replaces each substring of this string that matches the given regular expression with the given replacement.
    characters=str.replaceAll("[^A-Za-z]", "");  
    System.out.println("Numbers are: " + numbers);
    System.out.println("Characters are: " + characters);
}
}