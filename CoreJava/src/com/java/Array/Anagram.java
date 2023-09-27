package com.java.Array;

import java.util.Arrays;
import java.util.Scanner;
 
public class Anagram {
    public static void main(String args[]) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter First String");
        str1 = scanner.nextLine();
 
        System.out.println("Enter Second String");
        str2 = scanner.nextLine();
        // convert strings to char array
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        // sort the char array
        Arrays.sort(array1);
        Arrays.sort(array2);
        // if sorted char arrays are same then the string is anagram
        if (String.valueOf(array1).equals(String.valueOf(array2))) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }
    }
}