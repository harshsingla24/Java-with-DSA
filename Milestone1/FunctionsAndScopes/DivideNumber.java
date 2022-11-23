package Milestone1.FunctionsAndScopes;

public class DivideNumber {


	public static int divideNumber(int num ,int deno)
	{
		if(deno==0) 
		{
			return Integer.MIN_VALUE;
		}

		return num/deno;
	
	}


	public static void printDivisionReult(int num,int deno)
	{
		if (deno==0)
		{
			System.out.println("Divide by Zero is not Allowed");
			return;
		}
		System.out.println(num/deno);
	}



	public static void main(String[]args) 
	{
		int num=80;
		int deno=0;
		System.out.println(divideNumber(num,deno));
		printDivisionReult(num,deno);
	}








}
