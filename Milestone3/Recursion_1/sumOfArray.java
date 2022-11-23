package Milestone3.Recursion_1;

public class sumOfArray 
{
	public static int SumOfArray(int [] arr)
	{
	//	int sumFinal=0;
		
		if(arr.length==0)
		{
			return 0;
		}
		
		
		int smallArray[]=new int[arr.length-1];
		for(int i=0;i<smallArray.length;i++)
		{
			smallArray[i]=arr[i+1];
		}
		
		
		
		for(int i=0;i<smallArray.length;i++)
		{
		//	sumFinal+=smallArray[i];
		}
		
		
		int smallAns=SumOfArray(smallArray);
		
		
		//int output=sumFinal+arr[0];
		int output=smallAns+arr[0];   //both are correct
		
		
		
		
		return output;
				
	}
	
	public static void main(String []args)
	{
		int[] arr={1,2,3,4,5,15,70,200,30};
		System.out.println(SumOfArray(arr));
	}
}
