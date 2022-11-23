package Milestone2.Arrays2;

import java.util.Scanner;

public class rotateArray {
	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("This Program is Used to rotate arrays by a certain specified number");
	//  int arr[]= {1,2,3,4,5,6,7};
		int arr[]=takeInput();
		
		
		
	//	Total 3 Methods/Functions to Solve this Problem
		rotateusingreverse(arr,takeD());
	//	rotate1(arr, takeD());
	//	rotate2(arr, takeD());
		

		System.out.println("Rotated Array");
		printArrays(arr);
	
	}
	
	
	
	
	
	
	//Method 1
	public static void rotateusingreverse(int[]arr,int D)
	{
	//	//Printing Actual Array
		System.out.println("Actual Array");
		printArrays(arr);
		System.out.println("\n");
		
	//	//Reversing Actual Array
		reversefunction(arr);
		
	//	//Made a new array (arrA)and store all values except D
		int []arrA=new int[arr.length-D];
		for(int x=0;x<arr.length-D;x++)
		{
			arrA[x]=arr[x];
		}
	//	//Reverse the array (arrA)
		reversefunction(arrA);
		//printArrays(arrA);
		
		
		
		
	//	//Made a new array (arrB)and store D values 
		int []arrB=new int[D];
		
		int z=D;
		for(int x=0;x<D;x++)
		{
			arrB[x]=arr[arr.length-z];
			z--;
		}
//	//	Reverse the array (arrA)
		reversefunction(arrB);
		//printArrays(arrB);
		
		
		
		
		// // Save the value of (arrA) into main array (arr)
		
		for(int x=0;x<arr.length-D;x++)
		{
			arr[x]=arrA[x];
		}	
		
		
		// // Save the value of (arrB) into main array (arr)
		
		int zz=D;
		for(int x=0;x<D;x++)
		{
			arr[arr.length-zz]=arrB[x];
			zz--;
		}
		
		
		
	}
	
	
	
	
	
	//Method 2
	public static void rotate1(int[]arr,int D)
	{
		
		for(int i=0;i<D;i++)
		{
			 int j=0;
			 int temp=arr[j]; 
			 while(j<arr.length-1)
			 {
				 arr[j]=arr[j+1];
				 j++;
				 
			 }
			 arr[arr.length-1]=temp;
		}
		
	}
	
	
	
	
	//Method 3
	public static void rotate2(int[]arr,int D)
	{
		int arr2[]=new int [D];
		for(int x=0;x<D;x++)
		{
			arr2[x]=arr[x];
		}
		
		
		
		for(int i=0;i<arr.length-D;i++)
		{
			arr[i]=arr[i+D];
 
		}
		
		
		printArrays(arr2);
		int a=D;
		
		for(int z=0;z<D;z++)
		{
		
			arr[arr.length-a]=arr2[z];
			a--;
		}
		
	}
	
	
	
	public static void printArrays(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	

	public static int takeD()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Value of D:Array needs to be Rotated");
		int d=s.nextInt();
		s.close();
		return d;
	}

	
	
	//Required for Method 1
	public static void reversefunction(int []arr)
	{
		int n=arr.length;
		
		
		int[]arr2=new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[n-1]=arr[i];
			n--;
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			arr[j]=arr2[j];
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
