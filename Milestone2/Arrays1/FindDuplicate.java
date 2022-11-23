package Milestone2.Arrays1;
import java.util.Scanner;


public class FindDuplicate 
{

	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int n=s.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Value For Array at Index:-"+i);
			arr[i]=s.nextInt();
			if(arr[i]>n-2)
			{
				System.out.println("The Value at Any index must be in between 0 to "+(n-2));
				break;
			}
		}
		s.close();

		return arr;

	}


	public static int findDuplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					return arr[i];
				}
			}

		}



		return Integer.MIN_VALUE;
	}



	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number Of Test Cases You Want to Perform");
		int t=s.nextInt();

		for (int i=1;i<=t;i++)
		{
			int output =findDuplicate(takeInput());
			System.out.println("Answer:- "+output);
		}
		s.close();

	}
}


