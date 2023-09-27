package com.java.Array;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

        // Declare and Initialize an integer array
        int arr[] = { 2, 4, 3, 8, 11, 50, 7, 15, 5 };
 
        // Iterate the array
        for (int i = 0; i < arr.length; i++) {
 
            // Check whether the No. is Odd or Even
            // if reminder is 0 then, No. is an Even otherwise Odd
            if (arr[i] % 2 == 0) {
                // Even
                System.out.println(arr[i] + " is an Even number.");
            } else {
                // Odd
                System.out.println(arr[i] + " is an Odd number.");
            }
        }
 
    }
 
}