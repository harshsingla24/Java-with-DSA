package Milestone1.Fundamentals;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		    
		Scanner s= new Scanner(System.in);
		int a;
		a=s.nextInt();
		
		s.close();
		
		if(a%2 == 0) 
		{
			System.out.println(" is Even");
	
		}
		else
		{
			System.out.println("is odd");
		}
		
		
		
		
	}

}
