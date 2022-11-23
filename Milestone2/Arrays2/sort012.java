package Milestone2.Arrays2;

import java.util.Scanner;

public class sort012 
{
	public static void main(String[] args)
	{


		int arr[]=takeInput();
		sort(arr);
		printArrays(arr);


	}
	public static void swapfunction(int[]arr,int x, int y)
	{

		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
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


	public static void printArrays(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public static  void sort(int[]arr)
	{
		int nzero=0;
		int ntwo=arr.length-1;
		int i=0;
		while(i<=ntwo)
		{
			if (arr[i]==0)
			{

				swapfunction(arr, nzero, i);
				nzero++;
				i++;
			}
			else if (arr[i]==2)
			{

				swapfunction(arr, ntwo, i);
				ntwo--;

			}
			else
			{
				i++;
			}
		}
	}

	public static void sort1(int arr[])
	{
		int c0=0,c1=0;
		//int c2=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==0)
				c0++;
			if (arr[i]==1)
				c1++;
			//if (arr[i]==2)
			//	c2++;

		}

		for(int i=0;i<c0;i++)
		{
			arr[i]=0;
		}


		for(int i=c0;i<c0+c1;i++)
		{
			arr[i]=1;
		}


		for(int i=c0+c1;i<arr.length;i++)
		{
			arr[i]=2;
		}


	}

	public static void sort2(int arr[])
	{
		int nz=0;
		int nt=arr.length-1;

		int arr1[]=new int [arr.length];


		for (int i =0;i<=arr.length;i++)
		{
			// for putting 0&2 into array1 while array is being scanned
			if(i<arr.length) {
				if(arr[i]==0)
				{
					arr1[nz]=0;
					nz++;

				}
				if(arr[i]==2)
				{
					arr1[nt]=2;
					nt--;

				}
				if(arr[i]==1)
				{

				}

			}
			// for putting 1 into  array1 after whole array is scanned
			if(i>=arr.length)
			{
				for(int x=nz;x<=nt;x++)
				{
					arr1[x]=1;

				}
			}

		}



		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr1[i];
		}

	}





}
