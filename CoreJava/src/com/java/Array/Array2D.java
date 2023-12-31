package com.java.Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// Multidimensional Array // 3*3 Matrix
		int [][]Matrix=new int[3][3];
		Matrix[0][0]=0;
		Matrix[0][1]=1;
		Matrix[0][2]=2;
		Matrix[1][0]=3;
		Matrix[1][1]=4;
		Matrix[1][2]=5;
		Matrix[2][0]=6;
		Matrix[2][1]=7;
		Matrix[2][2]=8;
		for(int i=0;i<3;i++)//Rows
		{
			for(int j=0;j<3;j++)//Columns
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=scn.nextInt();
		System.out.println("Enter the number of columns");
		int columns=scn.nextInt();
		int [][]arr=new int[rows][columns];
		System.out.println("Enter the elements of Matrix");
		for(int i=0;i<rows;i++)//Rows
		{
			for(int j=0;j<columns;j++)//Columns
			{
				arr[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		System.out.println("Multidimensional Array Elements Are");
		for(int i=0;i<rows;i++)//Rows
		{
			for(int j=0;j<columns;j++)//Columns
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Addition");
		for(int i=0;i<rows;i++)//Rows
		{
			for(int j=0;j<columns;j++)//Columns
			{
				System.out.print(arr[i][j]+Matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
