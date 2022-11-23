package Milestone2.Array2D;

import java.util.Scanner;

public class rowWiseSum {

	
	public static void RowWiseSum(int[][] arr)
	{
		//int ansarr [] = new  int [arr.length];
		
		int rows=arr.length;
		int cols=arr[0].length;
		int sum=0;
		
		for (int i=0;i<rows;i++)
		{
			sum=0;
			for (int j=0;j<cols;j++)
			{
				sum+=arr[i][j];
			}

			System.out.print(sum+" ");
		}
		
		
		
		
	}
	
	
	public static int[][] take2dArrayInput()
	{
		
		System.out.println("Enter the Values of MAking a 2d Array");
		Scanner s=new Scanner(System.in);
		System.out.println("No of Rows");
		int rows=s.nextInt();
		System.out.println("No of Columns");
		int cols=s.nextInt();
		int [][]arr=new int [rows][cols];
		
		
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the value for Row "+i+ " and Column "+j);
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		s.close();
		
		
		
		return arr;
	}
	
	
	public static void main(String[] args) 
	{
		RowWiseSum(take2dArrayInput());
		
		
	}

}
