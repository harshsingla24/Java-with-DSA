package Milestone1.OperatorsAndForLoops;
import java.util.Scanner;
public class DecimalToBinary 
{

	public static void main(String[] args) 
	{

		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int ans=0,pv=1;


		
		while(n>0)
		{
			int remainder=n%2;
			ans+=remainder*pv;
			pv*=10;
			n=n/2;
		
			
		}
		 
			System.out.println(ans);
		}
	}


