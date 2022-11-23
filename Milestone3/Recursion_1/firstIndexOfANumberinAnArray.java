package Milestone3.Recursion_1;

import java.util.Scanner;

public class firstIndexOfANumberinAnArray {

	public static int FirstIndexOfANumberinAnArray (int arr[],int x,int startIndex)
	{
		if(startIndex==arr.length)
		{
			return -1;
		}
		if(arr[startIndex]==x)
		{
			return startIndex;
			
		}
			
		int smallFIOANIAA=FirstIndexOfANumberinAnArray(arr, x, startIndex+1);
		
		
		
		
		return smallFIOANIAA;
	}

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
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int arr[]=createarray();
		System.out.println("Enter the Value of X that you want to  find in Array");
		int x= s.nextInt();
		System.out.println("Enter The Start Index");
		int si=s.nextInt();
		System.out.println(FirstIndexOfANumberinAnArray(arr, x, si));

		s.close();

	}

}
