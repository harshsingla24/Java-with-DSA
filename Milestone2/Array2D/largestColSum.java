package Milestone2.Array2D;

import java.util.Scanner;

public class largestColSum 
{

	public static void main(String[] args)
	{

		int arr[][]=take2dArrayInput();

		int larColSum=largestCol(arr);

		System.out.println(larColSum);


	}


	public static int largestCol(int arr[][])
	{
		int largest=Integer.MIN_VALUE;
		int rows=arr.length;
		int cols=arr[0].length;


		for(int j=0;j<cols;j++)
		{
			int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum+=arr[i][j];
			}
			
			if(sum>=largest)
			{
				largest=sum;
			}
		}



		return largest;
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

	


}
