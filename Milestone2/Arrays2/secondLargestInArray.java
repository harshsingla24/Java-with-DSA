package Milestone2.Arrays2;

import java.util.Scanner;

public class secondLargestInArray 
{

	public static void main(String[] args) 
	{


int arr[]=takeInput();
int z=secondLargest(arr);

System.out.println("\n Ans: "+z);


	}


	public static int secondLargest (int[]arr)
	{

		int x = 0;
		
		int largestno=Integer.MIN_VALUE;
		int secondlargestno=Integer.MIN_VALUE;
		boolean isSame=false;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{


				isSame=true;
			}
			else
			{
				isSame=false;	
				break;
			}

		}

		if (isSame==true)

		{
			x=Integer.MIN_VALUE;
		}
		else if(isSame==false & arr.length<=1)
		{

			x=Integer.MIN_VALUE;

		}
		
		else if(isSame==false)
		{

		
//        Main Code Starts Here
			
			
			for(int i=0;i<arr.length;i++)
			{
				if (arr[i]>largestno)
				{
					largestno=arr[i];
				}
				
			}
					
			for(int i=0;i<arr.length;i++)
			{
				if (  arr[i]<largestno & arr[i]>secondlargestno)
				{
					secondlargestno=arr[i];
				}
				
			}
			
			x=secondlargestno;
			
			
			
			
			
			

		}

		return x;

	}







	public static void printArrays(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

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
