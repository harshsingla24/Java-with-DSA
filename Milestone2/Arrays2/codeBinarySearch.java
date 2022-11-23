package Milestone2.Arrays2;

import java.util.Scanner;

public class codeBinarySearch {

	public static int binarySearch(int[]arr,int x) 
	{
		int beg=0;
		int end=arr.length-1;
		int mid=(beg+end)/2;


		while(beg<=end)
		{
			if(arr[mid]<x)
			{
				beg=mid+1;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else if(arr[mid]==x)
			{
				return mid;
			}
			mid=(beg+end)/2;
		}

		return -1;
	}


	public static int takeInputX(int t)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Value u want to find in array for test case no."+t);
		int x=s.nextInt();
		s.close();
		return x;
	}
	public static int[] takeInput()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of array");
		int[]arr=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array Value at index "+i);
			arr[i]=s.nextInt();		}
		
		
			s.close();
			return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.println("Your Array is:- ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	


	public static void main(String[] args) {
		
		
		int[]arr=takeInput();
		printArray(arr);
	
		Scanner s=new Scanner(System.in);
		System.out.println("\nTest Cases");
		int t =s.nextInt();
		for(int i=1;i<=t;i++)
		{
			int ans=binarySearch(arr,takeInputX(i));
			System.out.println("Ans="+ans);
		}
		

		s.close();
	}

}
