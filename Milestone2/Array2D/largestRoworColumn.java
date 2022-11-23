package Milestone2.Array2D;

import java.util.Scanner;

public class largestRoworColumn 
{

	public static int[][] take2dArrayInput()
	{

		System.out.println("Enter the Values for Making a 2d Array");
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
	
	
	public static void LargestRoworColumnfn(int [][] arr)
	{
		
		

		int rows=arr.length;
		int cols=arr[0].length;
		
		
		int largest=Integer.MIN_VALUE;
		
		String str=" ";
		int no=0;
	
		
		// for calculating sum of the largest row
		
		for(int i=0;i<rows;i++)
		{
			int sum=0;
			for (int j=0;j<cols;j++)
			{
			sum+=arr[i][j];
			
			}
			if(sum>largest)
			{
				largest=sum;
				no=i;
				str="Row";
			}
		}
		
		
		// for calculating sum of the largest Column
	
		for(int j=0;j<cols;j++)
		{
			int sum=0;
			for (int i=0;i<rows;i++)
			{
			sum+=arr[i][j];
			
			}
			if(sum>largest)
			{
				largest=sum;
				no=j;
				str="Column";
				
			}
		}
		
		System.out.println(str+" "+no+" "+largest+" \n\n");

		
		
	}
	
	public static void testcase()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Test Cases");
		int t=s.nextInt();
		for (int i=0;i<t;i++)
		{
			LargestRoworColumnfn(take2dArrayInput());
		}
		s.close();
	}
	
	public static void main(String[] args) 
	{
	
		testcase();

	}

	

}
