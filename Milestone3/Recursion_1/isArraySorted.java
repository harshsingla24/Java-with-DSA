package Milestone3.Recursion_1;

import java.util.Scanner;

public class isArraySorted 
{
	

	public static boolean isSorted(int arr[])
	{
		if(arr.length==1)
		{
			return true;
		}
		if(arr[0]>arr[1])
		{
			return false;
		}
		
		int smallarray[]=new int [arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			smallarray[i-1]=arr[i];
		}
		
		boolean isSmallArraySorted=isSorted(smallarray);
		
		return isSmallArraySorted;
	}	

	public static boolean isSortedBetter(int arr[],int startIndex )
	{
		if(startIndex==arr.length-1)
		{
			return true;
		}
		if (arr[startIndex]>arr[startIndex+1])
		{
			return false;
		}
		boolean isSmallArraySorted=isSortedBetter(arr,startIndex+1);
		
		return isSmallArraySorted;
	}
	
	
	
	
	public static void main(String[] args)
	{

		
		int[] arr={1,2,3,4,5};
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Start Index");
		int x=s.nextInt();
		
		
		System.out.println(isSortedBetter(arr,x));
		System.out.println(isSorted(arr));
		s.close();
	}

}
