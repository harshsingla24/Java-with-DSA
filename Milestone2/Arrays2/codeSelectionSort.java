package Milestone2.Arrays2;

import java.util.Scanner;

public class codeSelectionSort {
	
	

	public static void main(String[] args) {
		
		//int arr1[]= {54,265,5,6,44,65,167,16},arr[]= {9,5,2,3,1,6,7,4,8};
		
		
		
	printArray(selectionSort(takeInput()));
		
	}
	
	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Length of Array");
		int []arr=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array Value for Index "+i);
			arr[i]=s.nextInt();
			
		}
		
		s.close();
		return arr;
		
	}
	public static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] selectionSort(int[] arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					arr[j]=arr[i];
				}
				
				arr[i]=min;
			}
		}
		
		
		return arr;
		
	}

}
