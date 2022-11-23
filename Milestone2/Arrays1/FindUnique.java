package Milestone2.Arrays1;

import java.util.Scanner;

public class FindUnique {

	public static int findUnique(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int j;
			for(j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						break;
					}
				}
			} 
			if(j==arr.length)
			{
				return arr[i];
			}
		}
		
		return findUnique(arr);
	}
	
	
	
	
	
	public static int[] takeInput() 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("\nLength of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Value for Index: "+i);
			arr[i]=s.nextInt();
			
		}
		s.close();
			
		return arr;
	}
	


	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("No of Test Cases ");
		int t=s.nextInt();
	
		for (int i=1;i<=t;i++)
		{
			int uniqueintegerinarray=findUnique(takeInput());
			System.out.println("\nAnswer:-\n"+uniqueintegerinarray);
		}
	
		s.close();
	
	}

}
