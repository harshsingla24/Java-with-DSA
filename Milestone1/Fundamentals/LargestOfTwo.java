package Milestone1.Fundamentals;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[]args) {

		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();


		s.close();


		if(a>b)
		{
			System.out.println("A is Greater than B");
		}
		else if(a<b)
		{
			System.out.println("B is Greater than A");
		}

		else 
		{ 
			System.out.println("A & B are Equal");
		}

		System.out.println("Hope U Like This Program");
	}
}

