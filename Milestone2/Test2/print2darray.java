package Milestone2.Test2;

import java.util.Scanner;

public class print2darray {

	public static int [][] takeinput2daarray()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter Rows and Colums for Creating an array");
		int rows=s.nextInt();
		int cols=s.nextInt();
		int arr [][]=new int [rows][cols];

		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)

			{
				System.out.println("Enter Value for Row "+i+" & Column "+j);
				arr[i][j]=s.nextInt();
			}
		}
		s.close();

		return arr;
	}



	public static void print2DArray(int input[][]) 
	{
		// Write your code here

		int n=input.length;
	//	int m=input[0].length;





		for (int i=0;i<input.length;i++)

		{
			for(int k=0;k<n;k++)
			{

				for (int j=0;j<input[0].length;j++)
				{

					System.out.print(input[i][j]+" ");

				}
				System.out.println();

			}
			n--;
			System.out.println();
		}

	}





	public static void main(String[] args) 
	{

		//	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

		print2DArray(takeinput2daarray());

	}


}
