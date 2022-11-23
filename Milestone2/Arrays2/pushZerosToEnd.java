package Milestone2.Arrays2;

import java.util.Scanner;

public class pushZerosToEnd 
{




	public static void main (String []args)
	{


		testCase();

	}

	public static void zerostoend(int[]arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]==0) 
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}


	public static int[] takeInput()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("\nLength of array");
		int arr[]=new int[s.nextInt()];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value at index "+i);
			arr[i]=s.nextInt();
		}
		s.close();

		return arr;
		
		
	}
	
	
	public static void mainFunction()
	{
		int[]arr=takeInput();
		zerostoend(arr);
		printArrays(arr);
	}


	public static void testCase()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Test Cases");
		int t=s.nextInt();

		for(int i=1;i<=t;i++)
		{

			mainFunction();
		}
		s.close();
	}

	

	public static void printArrays(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}


}
