package Milestone2.Array2D;

import java.util.Scanner;

public class printLikeaWave {

	public static  int [][] takeInput2dArray()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows and Colums for array Size");
		int rows=s.nextInt();
		int columns=s.nextInt();

		int arr[][]=new int [rows][columns];

		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				System.out.println("Enter the value for Row "+i+" & Columns "+j);
				arr[i][j]=s.nextInt();

			}
		}
		s.close();

		return arr;
	}



	public static void printsinwave2darray(int[][]arr )
	{
		//int rows=arr.length;
	//	int columns=arr[0].length;



		for(int j=0;j<arr[0].length;j++) 
		{


			if(j%2==0) 
			{
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+" ");

				}
				System.out.print(" ");
			}
			

			else
			{

				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");

				}
				System.out.print(" ");


			}
		}
	}


	public static void main(String[] args)
	{
		printsinwave2darray(takeInput2dArray());


	}

}
