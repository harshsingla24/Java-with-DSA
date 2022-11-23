package Try;
import java.util.*;

public class factorial 
{


	public static void Factorial(int x)
	{
		int i,fact=1,number=x;
		for(i=number;i>0;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
	
		

		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		Factorial(x);
		s.close();
		


	}


}
