package Milestone2.Array2D;

import java.util.Scanner;

public class InputAndPrint 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Input For Creating a 2-D Array");
		System.out.println("\nEnter the Numbers of Rows");
		int rows=s.nextInt();
		System.out.println("Enter number of Columns");
		int cols =s.nextInt();
		int arr[][]=new int [rows][cols];

		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				System.out.println("Enter the Element at "+i+"  Row & "+j+" Column");
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println();




		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}


		s.close();


	}

}






/*
// Code for Column Wise 

public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Input For Creating a 2-D Array");
		System.out.println("\nEnter the Numbers of Rows");
		int rows=s.nextInt();
		System.out.println("Enter number of Columns");
		int cols =s.nextInt();
		int arr[][]=new int [rows][cols];

		for (int i=0;i<cols;i++)
		{
			for (int j=0;j<rows;j++)
			{
				System.out.println("Enter the Element at "+i+" Column & "+j+" Row");
				arr[j][i]=s.nextInt();
			}
		}
		System.out.println();




		for (int j=0;j<rows;j++)
		
		{
			for(int i=0;i<cols;i++)
			{
				System.out.print(arr[j][i]+" ");	
			}
			System.out.println();
		}

		
		
		
	}




*/










