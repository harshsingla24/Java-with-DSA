package Milestone2.Arrays1;

import java.util.Scanner;



public class ReturnArraySum 
{

	public static int sum(int[] arr) 
	{
		
		int n = arr.length;
		int sum = 0;
		System.out.println();
		System.out.println("Sum of Array is : ");
		for (int i=0; i<n; i++)
		{

			sum = sum + arr[i];
		}

		return sum ;
	}


	public static int[] takeInput() 
	{
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println("Desired Array Length");
		int n=s.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value at '"+i+"'  index:- ");
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
	}
	public static void main(String[] args)
	{


		Scanner t=new Scanner(System.in);
		System.out.println("How Many Test Cases you would like to Run : ");
		int t1=t.nextInt();

		for (int i=1;i<=t1;i++)
		{


			System.out.println("\nCurrent Test Case No is "+i);
			System.out.println(sum(takeInput()));
		}

		t.close();
	}

}
