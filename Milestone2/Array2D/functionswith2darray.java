package Milestone2.Array2D;

import java.util.Scanner;

public class functionswith2darray {
	
	public static  int[][] takeInput()
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
		s.close();

		return arr;
	}
	
	
	
	
	
	public static void print2darray(int [][] arr)
	{

		int rows=arr.length;
		int cols=arr[0].length;
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) 
	{
		
	int [][]arr=takeInput();
	print2darray(arr);
	}
	
	

}
