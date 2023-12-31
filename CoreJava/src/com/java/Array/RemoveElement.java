package com.java.Array;
/*Java Program to delete an element from an Array*/
import java.util.Arrays;
import java.util.Scanner; 
public class RemoveElement {
public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  // Remove the second element (index->1, value->14) of the array
   int removeIndex = 1;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
    
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        Integer arr[]=new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = sc.nextInt();
    
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == elem)   //If element found
      {
        // shifting elements
        for(int j = i; j < arr.length - 1; j++)
        {
            arr[j] = arr[j+1];
        }
        break;
      }
    }
      
       System.out.println("Elements after deletion " );
       for(int i = 0; i < arr.length-1; i++)
       {
             System.out.print(arr[i]+ " ");
       }  
    }
}
