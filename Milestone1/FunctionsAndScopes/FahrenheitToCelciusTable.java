package Milestone1.FunctionsAndScopes;
import java.util.Scanner;
public class FahrenheitToCelciusTable 
{
	//
	//
	//	public static void FahrenheitTable(int S, int E,int W)
	//	{
	//		while(S<E) 
	//		{
	//			int temp=(S-32)*5/9;
	//			System.out.println(S+" "+temp);
	//			S+=W;
	//		}
	//
	//	}
	//	
	//	public static void main(String[]args)
	//	{
	//		
	//	}
	//}

	public static void printFahrenheitTable(int start,int end,int step) 
	{
		int currentValue=start;
		while(currentValue<=end)
		{
			int fahrenheitValue=(int)((5.0/9)*(currentValue-32));
			System.out.println(currentValue+"\t"+fahrenheitValue);
			currentValue+=step;
		}

	}
	
	public static void main(String[]args)
	{
		Scanner s =new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		s.close();
		
		printFahrenheitTable(start, end, step);
		
	}
}