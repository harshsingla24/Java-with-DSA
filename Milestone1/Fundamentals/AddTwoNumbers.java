package Milestone1.Fundamentals;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		System.out.println(c);
		s.close();
	}

}
