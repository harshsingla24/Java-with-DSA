package Milestone2.Arrays1;

import java.util.Scanner;

public class TripletSum {
	
	public static int [] takeInput()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of array");
		
		int arr[]=new int[s.nextInt()];
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value at index "+i);
			arr[i]=s.nextInt();
		}
		s.close();
		
		return arr;
		
	}
	
	
	public static int takeInputX()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the sum u want for  array");
		
		int x=s.nextInt();
	
		
		s.close();
		return x ;
		
	}

	public static int tripletSum(int arr[], int x)
	{
		int z=0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				
				for (int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
					{
						z++;
					}
				}
				
			}
			
			
		}
		
		return z;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		System.out.println("\nEnter the no of Test cases u want to perform\n");
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{
			int ans=tripletSum(takeInput(), takeInputX());
			System.out.println(ans);
		}
		
		s.close();
	}

}
