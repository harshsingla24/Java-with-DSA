package Milestone2.Arrays1;

import java.util.Scanner;

public class IntersectionOfTwoArrays_II 
{



	public static void Intersection(int arr1[],int arr2[])
	{
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i])
				{
					System.out.print(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
				//	arr1[i]=Integer.MIN_VALUE;
					break;
				}
			}

		}


		





	}

	public static int[] takeInput(int t,int z)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the Length for Array "+z+" of Test Case  "+t);
		int n=s.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value for array "+z+" at index "+i);
			arr[i]=s.nextInt();
		}


		s.close();
		
		return arr;

	}


	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("No of Test Cases");
		int t=s.nextInt();
		int[] arr1 = null,arr2 = null;
		for(int i=1;i<=t;i++)
		{
			int z=1;
			arr1=takeInput(i,z);
			z++;
			arr2=takeInput(i,z);
			System.out.println("Intersection of Array  "  +i+" & "+z+  " is:-");
			Intersection(arr1, arr2);
			System.out.println("\n");
			
		}
		
		
		s.close();
	}

}
