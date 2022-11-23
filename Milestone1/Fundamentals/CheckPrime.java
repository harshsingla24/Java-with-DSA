package Milestone1.Fundamentals;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.close();
		
		int div=2;
		
		boolean isPrime=true;
		
		while(div <= n-1) {
			if(n%div==0) {
				isPrime=false;
			}
			
			div=div+1;			
		}
		if(isPrime) 
		{
			System.out.println("The Number is Prime");	
		}
		else
		{
			System.out.println("The Number is Composite");
		}
	}

}
