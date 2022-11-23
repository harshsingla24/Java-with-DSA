package Milestone1.FunctionsAndScopes;

import java.util.Scanner;

public class FibonacciNumber {

	public static boolean checkNumber(int n)
	{
		int a=0,b=1,c;
		if(n==a || n==b)
		{
			System.out.println(true);
		}
		while(true)
		{
			c=a+b;
			a=b;
			b=c;
			if(c==n)
			{
				System.out.println(true);
				break;
			}
			if(c > n)
			{
				

				return false;	
			}

		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x =s.nextInt();
		s.close();
		System.out.println(checkNumber(x));
		
	}

}
