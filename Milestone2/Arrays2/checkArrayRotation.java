package Milestone2.Arrays2;

import java.util.Scanner;

public class checkArrayRotation 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Test Cases");
		int t=s.nextInt();

		for(int i=0;i<t;i++)
		{

			int arr[]=takeInput();
			int ans=CheckArrayRotation(arr);

			System.out.println("\nAns: "+ans);
		}

		s.close();
	}

	public static int CheckArrayRotation(int[]arr)
	{
		int x=Integer.MIN_VALUE;
		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]>x)
			{
				x=arr[i];
				count++;
			}
			if(count==arr.length)


			{
				count=0;
			}
		}

		return count;
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

}
