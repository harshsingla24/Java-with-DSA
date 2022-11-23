package Milestone1.Fundamentals;
import java.util.*;
public class SumOfEvenAndOdd 
{
	public static void main(String[]args)
	{
		
	Scanner s=new Scanner(System.in);
	int n,even,odd,rem;
	n=s.nextInt();
	even=0;
	odd=0;
	rem=0;
	s.close();
	while(n>0 && n<=100000000) 
	{
		rem=n%10;
		n=n/10;
		if(rem%2==0) 
		{
			even=even+rem;
		}
		else 
		{
			odd=odd+rem;
		}
	}
	
	
	
	System.out.println(even+" "+odd);
	
	
	}

}
