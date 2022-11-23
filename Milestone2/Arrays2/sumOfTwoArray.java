package Milestone2.Arrays2;
import java.util.Scanner;

public class sumOfTwoArray {

	public static void main(String[] args) {
	
		System.out.println("Test Cases");
		Scanner s= new Scanner (System.in);
		int t=s.nextInt();
		for(int i=1;i<=t;i++)
		{

			int arr1[]= takeInputArray();
			int arr2[]= takeInputArray();
			int arr[]=sum(arr1,arr2);

			printArray(arr);

		}
		s.close();

	}
	public static int[] sum(int[]arr1,int[]arr2)
	{

		
		int[]arr=new int[1+Math.max(arr1.length,arr2.length)];



		int carry=0;
		int k=arr.length-1;
		
		int i=arr1.length-1;
		int j=arr2.length-1;



		while(i>=0 &&j>=0)
		{
			int sum=arr1[i]+arr2[j]+carry;
			arr[k]=sum%10;
			carry=sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0)
		{
			int sum=arr1[i]+carry;
			arr[k]=sum%10;
			carry=sum/10;
			i--;
			k--;	
		}
			
		while(j>=0)
		{
			int sum=arr2[j]+carry;
			arr[k]=sum%10;
			carry=sum/10;
			j--;
			k--;
		}
		arr[0]=carry;

		return arr;	        
	}
	
	
	
	

	public static void printArray(int[]arr)
	{
		System.out.println("Ans: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}



	public static int[] takeInputArray()
	{

		Scanner s=new Scanner(System.in);

		System.out.println("Length of Array");
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Value of Array at Index:"+i);
			arr[i]=s.nextInt();
		}

		s.close();
		return arr;

	}
}
