package Milestone3.Recursion_1;

import java.util.Scanner;

public class lastIndexOfANumberinAnArray 
{

	public static int LastIndexOfANumberinAnArrayBetter (int arr[],int x,int startIndex)
	{
		if(startIndex==arr.length)
		{
			return -1;
		}
		int k=LastIndexOfANumberinAnArrayBetter(arr, x, startIndex+1);
		if(k!=-1)
		{
			return k;
		}
		else
		{
			if(arr[startIndex]==x)
			{
				return startIndex;
			}
			else
			{
				return -1;
			}
		}


	}

	public static int LastIndexOfANumberinAnArray (int arr[],int x)
	{
		if(arr.length==0)
		{
			return -1;
		}

		int smallArray[]=new int[arr.length-1];
		for(int i=0;i<smallArray.length;i++)
		{
			smallArray[i]=arr[i+1];
		}
		int k=LastIndexOfANumberinAnArray(smallArray, x);
	
		if(k!=-1)
		{
			return k+1;
		}
		else
		{
			if(arr[0]==x)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}




	}

	public static void main(String[] args) 
	{
		int []arr= {1,8,5,465,4,8,42,51,5,4,8,52,8,54};
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(LastIndexOfANumberinAnArray(arr,x));
		//System.out.println(LastIndexOfANumberinAnArrayBetter(arr,x,0));




		s.close();
	}

}
