package Milestone2.Arrays2;

public class reverseArray 
{

	public static void main(String[] args) 
	{
		
		int[]arr= {1,2,3,4,5};
		reverse(arr);
		printArrays(arr);
		
		

	}

	
	public static void reverse(int []arr)
	{
		int n=arr.length;
		
		
		int[]arr2=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr2[n-1-i]=arr[i];
			
			
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			arr[j]=arr2[j];
		}
		
		
	}
	public static void printArrays(int []arr)
	{
		System.out.print("Ans: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}


}
