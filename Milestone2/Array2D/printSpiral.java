package Milestone2.Array2D;

import java.util.Scanner;

public class printSpiral {


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


	public static void printSpiralfn(int arr[][])
	{

		int rows=arr.length;
		int cols=arr[0].length;


		int i, rowstart=0 , colstart=0;
		int numElements= rows*cols;
		int count=0;

		while(count<numElements)
		{
			for(i=colstart; count<numElements && i<cols;i++)
			{
				System.out.print(arr[rowstart][i]+" ");
				count++;
			}
			rowstart++;

			for(i=rowstart; count<numElements && i<rows;i++)
			{
				System.out.print(arr[i][cols-1]+" ");
				count++;
			}
			cols--;

			for(i=cols-1;count<numElements && i >=colstart;i--)
			{
				System.out.print(arr[rows-1][i]+" ");
				count++;

			}
			rows--;

			for(i=rows-1;count<numElements && i>=rowstart;i--)
			{
				System.out.print(arr[i][colstart]+" ");
				count++;
			}
			colstart++;


		}

	}
	public static void main(String[] args) 
	{
		printSpiralfn(takeinput2daarray());

	}

}
