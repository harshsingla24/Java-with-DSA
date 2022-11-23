package Milestone2.Arrays2;

import java.util.Scanner;

public class codeMergeTwoSortedArrays 
{










	public static void main(String[] args) 
	{


    //  Test Array
	//	int arr3[]= {1,2,5,7,14,20,30};
	//	int arr4[]= {2,3,5,6,9,11,18,20,33,54,100};
		
		System.out.println("This Program Merges 2 Different Sorted Arrays Resulting in 1 Sorted Array ");

		int []arr1= takeInput();
		int []arr2=takeInput();

		int arr[]=mergeSortedArray(arr1,arr2);
		printArr(arr);


	}

	public static int[] mergeSortedArray(int arr1[],int arr2[])
	{

		int [] arr=new int[arr1.length+arr2.length];
		int i = 0,j = 0,k = 0;

		while(i<arr1.length && j<arr2.length)
		{


			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else if(arr1[i]>=arr2[j])
			{
				arr[k]=arr2[j];
				j++;
				k++;
			}

		}

		while(i<arr1.length)
		{
			arr[k]=arr1[i];
			i++;k++;
		}


		while(j<arr2.length)
		{
			arr[k]=arr2[j];
			j++;k++;

		}



		return arr;


	}










	public static int[] takeInput()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("\nLength of array");
		int arr[]=new int[s.nextInt()];

		System.out.println("All Indexes Must be Sorted/arranged in Ascending Order\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value at index "+i);
			arr[i]=s.nextInt();
		}

		s.close();
		return arr;
	}




	public static void printArr(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}







}
