package com.java.Array;

import java.util.*;
public class Merge
{
    public static void main(String args[])   
   {  
        String arr1[] = { "D", "A", "T", "A" };         
        String arr2[] = { "F", "L", "A", "I", "R" };   
        List list = new ArrayList(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));     
        Object[] arr3 = list.toArray();  
        System.out.println(Arrays.toString(arr3));
        
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] TLen = new int[aLen + bLen];
        System.arraycopy(array1, 0, TLen, 0, aLen);
        System.arraycopy(array2, 0, TLen, aLen, bLen);
        System.out.println(Arrays.toString(TLen));
   }
}