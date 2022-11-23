package Milestone2.Arrays1;

import java.util.Scanner;

public class Sort01 {




	public static int [] takeInput()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\n\nLength of Array");
		int arr[]=new int[s.nextInt()];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value at index "+i);
			arr[i]=s.nextInt();
			if(arr[i]>1 || arr[i]<0)
			{
				System.out.println("Only Zero and One is Allowed");
				break;
			}
		}
		s.close();
		return arr;

	}



	public static int[] Sort(int []arr)
	{
		int zerocount=0;
		for(int i=0;i<arr.length;i++)
		{


			if(arr[i]==0)
			{
				zerocount++;
			}


		}

		for(int j=0;j<zerocount;j++)
		{
			arr[j]=0;
		}
		for(int k=zerocount;k<arr.length;k++)
		{
			arr[k]=1;
		}




		return arr;
	}


	public static void printArray(int[] arr)
	{
		
		System.out.print("Answer:- ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Test Cases");
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{
			printArray(Sort(takeInput()));

		}
		s.close();
	}

}
