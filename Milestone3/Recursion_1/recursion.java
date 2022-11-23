package Milestone3.Recursion_1;

import java.util.Scanner;

public class recursion 
{
	public static int factorial(int x)
	{

		if(x==1)
		{
			return 1;
		}
		int smallOutput=factorial(x-1);
		int ans = x*smallOutput;;

		return ans;
	}
	public static int sumOfN(int x)
	{
		if (x==0)
		{
			return 0;
		}
		int smallOutput=sumOfN(x-1);
		int output=x+smallOutput;
		return output;

	}

	public static int xPowerN(int x, int n)
	{
		if(x==0&n==0)
		{
			return 1;

		}
		if(x==0)
		{
			return 0;
		}



		if(n==0)
		{ 
			return 1;
		}
		int smallOutput=xPowerN(x, n-1);
		int output=x*smallOutput;
		return output;
	}

	public static int DigitCount(int x)
	{
		if (x==0)
		{
			return 0;
			
		}
		int smallOutput=DigitCount(x/10);
		int output=smallOutput+1;
		return output;
		
	}
	
	
	
	public static void print1ToX(int x)
	{
		if(x==0)
		{
			return;
		}
		print1ToX(x-1);
		System.out.print(x+" ");
	}
	
	
	public static int fibonacci(int x)
	{
		if (x==1 ||x==2)
		{
			return 1;
		}
		int fib_n_1=fibonacci(x-1);
		int fib_n_2=fibonacci(x-2);
		int output=fib_n_1+fib_n_2;
		return output;
	}


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Type X & N");
		int x= s.nextInt();
		int n=s.nextInt();
		System.out.println("Factorial of x");
		System.out.println(factorial(x));

		System.out.println("Sum of N numbers");
		System.out.println(sumOfN(x));
		System.out.println("x^n");
		System.out.println(xPowerN(x,n));
		//System.out.println();
		System.out.println("No of digits in X");
		System.out.println(DigitCount(x));
		System.out.println("Print 1 to X");
		print1ToX(x);
		System.out.println("\nX Fibonacci Number");
		System.out.println(fibonacci(x));
		s.close();
	
	}

}
