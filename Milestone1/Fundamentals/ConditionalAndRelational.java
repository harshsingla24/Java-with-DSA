package Milestone1.Fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		
		
		Scanner s=  new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		

		s.close();
		
		
		if(a>0&&b>0) {
			System.out.println("Both are Positive");
		}
		else {
			System.out.println("Both are not positive");
		}
		


		if(a==b) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
			
		
		
		
		
		
		
		
		
	}

}
