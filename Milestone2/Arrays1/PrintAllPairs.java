package Milestone2.Arrays1;

public class PrintAllPairs {

	public static void printAllPairs(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			System.out.print(i+1+".  ");
			for (int j=i+1;j<n;j++)
			{
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			System.out.println();
			
		}
	}
	
	
	public static void main(String[] args) {
		int []arr= {1,4,7,6,5};
		printAllPairs(arr);
	}

}
