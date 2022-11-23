package Milestone2.Arrays1;

import java.util.Scanner;

public class LinearSearch {

	public static int[] takeInput()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nDesired Length of Array: ");
		int n=s.nextInt();
		int arr[]=new  int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Value for '"+i+"' Index");
			arr[i]=s.nextInt();
			
		}
		s.close();
		return arr;
	}
	
	
	
	public static int integertobesearched(int[]arr)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Element to be Searched ");
		int x=s.nextInt();		
		int index=-1;
		int count=0;
		int n=arr.length;
		int finaloutput=0;
		for(int i=0;i<arr.length;i++)
		{
			index++;
			
			if(arr[i]==x)
			{
				
				count++;
				if(count>1) 
				{
					finaloutput=count;
					
				}
				else if(count==1)
				{
					finaloutput=index;
				}
				
			}
			else if (count==0 & i==arr.length-1 & x!=arr[n-1])
			{
				finaloutput=-1;
			}
			
		}
		System.out.println("Answer");
		
		
			
		s.close();
		return  finaloutput;
	}
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("                 Linear Search in Array\n\n\n");
		
		
		System.out.println("                 No of Test Cases you want to Run: ");
		int t= s.nextInt();
		for(int i=1;i<=t;i++)
		{
			
			System.out.println(integertobesearched(takeInput()));
			System.out.println("\n\n\n");
		}
		s.close();

	}

}







