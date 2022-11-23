package Milestone3.Recursion_1;

import java.util.Scanner;

public class CheckNumberInArray
{

	public static int [] createarray()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Length of Array");
		int n=s.nextInt();

		int arr[]=new int[n];


		for(int i=0;i<n;i++)
		{
			System.out.println("Value for array at Index "+i);
			arr[i]=s.nextInt();   
		}
		s.close();

		return arr;
	}


	public static boolean checkNumberInArray(int arr[],int x)
	{
		if(arr.length==0)
		{
			return false; 
		}
		if(arr[0]==x )
		{
			return true;
		}

	
		int[] smallArray=new int[arr.length-1];
		for(int i =0;i<smallArray.length;i++)
		{
			smallArray[i]=arr[i+1];
		}
		boolean isSmallArrayHaveNumber=checkNumberInArray(smallArray, x);

		for(int i=0;i<smallArray.length;i++)
		{
			if(smallArray[i]==x)
			{
				return true;
			}
		}

		return isSmallArrayHaveNumber;
	}

	public static void main(String args[])
	{
		Scanner s= new Scanner (System.in);
		//int arr[]=createarray();
		System.out.println("Enter the Value of X that you want to  find in Array");
		int x= s.nextInt();
		int arr1[]= {1,2,3,4,5};
		System.out.println(checkNumberInArray(arr1, x));


		s.close();
	}
}