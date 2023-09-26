package com.java.String;
import java.util.Scanner;
public class UppercaseLowercase
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("\nEnter a string: ");
	    String inputString = scanner.nextLine();
	    int i, asciiValue;
	    char originalChar, modifiedChar;
	    String uppercaseString = "";
	    String lowercaseString = "";

	    // Loop to convert lowercase to uppercase
	    for (i = 0; i < inputString.length(); i++) {
	      originalChar = inputString.charAt(i);
	      asciiValue = (int) originalChar;
	      if (asciiValue >= 97 && asciiValue <= 122) {
	        asciiValue -= 32;
	        modifiedChar = (char) asciiValue;
	      } else {
	        modifiedChar = originalChar;
	      }
	      uppercaseString += modifiedChar;
	    }
	    System.out.println("\nUppercase String: " + uppercaseString);

	    // Loop to convert uppercase to lowercase
	    for (i = 0; i < inputString.length(); i++) {
	      originalChar = inputString.charAt(i);
	      asciiValue = (int) originalChar;
	      if (asciiValue >= 65 && asciiValue <= 90) {
	        asciiValue += 32;
	        modifiedChar = (char) asciiValue;
	      } else {
	        modifiedChar = originalChar;
	      }
	      lowercaseString += modifiedChar;
	    }
	    System.out.println("\nLowercase String: " + lowercaseString);
	  }
}