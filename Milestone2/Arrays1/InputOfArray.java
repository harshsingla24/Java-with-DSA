package Milestone2.Arrays1;

import java.util.Scanner;

public class InputOfArray {

	public static void printArray(int[] arr)
	{
		System.out.println("Elements of Array are : ");
		int n=arr.length;
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] takeInput() 
	{

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element at '"+i+"' th Index");
			arr[i]=s.nextInt();
			System.out.println();

		}
		s.close();
		return arr;
	}

	public static void main(String[] args) 
	{

		int[]arr=takeInput();
		printArray(arr);
	}


}
