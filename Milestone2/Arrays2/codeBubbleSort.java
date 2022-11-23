package Milestone2.Arrays2;

import java.util.Scanner;

public class codeBubbleSort 
{
	
	
	public static void bubbleSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
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
	
	public static void printArr(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[]args)
	{
		
		System.out.println("Test cases");
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{
			int arr[]= takeInput();
			bubbleSort(arr);
			printArr(arr);
		}
		
		s.close();
	
	}
}	
	
	
	