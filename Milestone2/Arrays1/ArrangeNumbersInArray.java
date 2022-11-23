package Milestone2.Arrays1;
import java.util.Scanner;
public class ArrangeNumbersInArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Test Cases U want to Perform: ");
		int t=s.nextInt();
		for (int j=1;j<=t;j++) 
		{
			System.out.println("Length of Array");
			int n=s.nextInt();
			int arr[]=new int[n];

			int start=1;

			if(n%2==0) {
				for(int i=0;i<(n/2);i++) 
				{
					arr[i]=start;
					start+=2;
				}
				int end=start-1;

				for(int i=(n/2);i<n;i++) 
				{
					arr[i]=end;
					end-=2;
				}

				for(int i=0;i<n;i++) 
				{
					System.out.print(arr[i]);
					System.out.print(" ");
				}
			}

			else if(n%2!=0) 
			{
				for(int i=0;i<(n/2)+1;i++) 
				{
					arr[i]=start;
					//				System.out.println(start);
					start+=2;

				}
				start-=2;
				int end=start-1;

				for(int i=(n/2)+1;i<n;i++) 
				{
					arr[i]=end;
					//				System.out.println(end);
					end-=2;

				}

				for(int i=0;i<n;i++) 
				{
					System.out.print(arr[i]);
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		s.close();
	}

}
