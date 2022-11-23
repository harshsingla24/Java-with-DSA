package Milestone2.Array2D;

import java.util.Scanner;

public class totalSumontheBoundariesandDiagonals {


	public static int totalSumfn(int arr[][])
	{
		int sum=0;

		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//for diagonals
				if( i==j|| (i+j)==arr.length-1)
				{
					sum+=arr[i][j];	
				}
				//for Boundaries
				else if(i==0||j==0||i==arr.length-1||j==arr.length-1)
				{
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}

	
	
	public static int [][] takeinput2darray()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the dimension for your Square Matrix/Array");
		int n= s.nextInt();

		int arr[][]=new int [n][n];

		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.println("Value for Row "+i+" & Column "+j );
				arr[i][j]=s.nextInt();
			}
		}

		s.close();

		return arr;
	}

	public static void main(String[] args) 
	{

	System.out.println(totalSumfn(takeinput2darray()));
	}

}
