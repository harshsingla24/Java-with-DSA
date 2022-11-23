package Milestone2.Arrays1;

import java.util.Scanner;

public class PairSum {

	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Length of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value for array at Index"+i);
			arr[i]=s.nextInt();
		}
		s.close();
		
		return arr;
		
		
	}
	
	public static void pairSum(int arr[])
	
	
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  sum u want to check");
		int x=s.nextInt();
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==x) 
				{
						System.out.println(i+" "+j);
					ans++;
				}
			}
			
		}
		System.out.println("\nAnswers is:- "+ans);
		
		s.close();
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Test Cases u want to Perform");
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{
			pairSum(takeInput());
		}
		s.close();
	}

}
