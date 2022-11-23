package Milestone2.Arrays2;

import java.util.Scanner;

public class codeInsertionSort 
{
	public static void main(String []args)
	{



		int [] arr=takeInput();
		insertionSort(arr);
		printArray(arr);


	}
	
	public static void insertionSort(int arr[])
	{

		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}



	}




	public static void printArray(int[]arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}



	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Length of Array");
		int[] arr=new int[s.nextInt()];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value for Index "+i);
			arr[i]=s.nextInt();
		}

		s.close();
		return arr;
	}

	






}
