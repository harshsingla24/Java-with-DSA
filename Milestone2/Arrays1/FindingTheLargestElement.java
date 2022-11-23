package Milestone2.Arrays1;

import java.util.Scanner;

public class FindingTheLargestElement 
{

	
	
	public static int[] takeInput() 
	
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Value for Size of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the value for '"+i+"' th Index");
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
	}
	
	
	public static int largest(int arr[]) 
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if (max<arr[i]) 
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) 
	{
		int arr[]=takeInput();
		int lar=largest(arr);
		System.out.println("\nLargest Element of Array is :- "+lar);
		
	}

}
