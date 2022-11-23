package Milestone2.Array2D;

public class moreOn2dArray 
{

	public static void main(String[] args) 
	{
		
		
		//Jagged Array :- arrays with different columns
		
		
		
		
		//initialized a new 2d array with 4 rows and no colums
		int arr [][]=new int [4][];
		
		
		//adding different lengths of columns in arr
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=new int [i+2];
			
		}
		
		//printing array with different columns
		
		for(int i=0;i<arr.length;i++)//rows
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
