package Milestone2.Arrays1;

import java.util.Scanner;

public class SwapAlternate {

	public static void swapAlternate(int[] arr)
	{
		int n=arr.length;
	//	int j;
		for(int i=0;i<n-1;i+=2)
		{


			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println("Elements of Array are : ");
		
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}



	}


	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\n\nLength of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value for Index:- "+i);
			arr[i]=s.nextInt();
		}
		s.close();
		return arr;
	}




	public static void main(String[] args) {

		

		Scanner s= new Scanner(System.in);
		System.out.println("Enter No of Test Cases you want to perform");
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{

			swapAlternate(takeInput());

		}

		s.close();
	}

}
