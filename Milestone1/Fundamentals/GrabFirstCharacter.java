package Milestone1.Fundamentals;

import java.util.Scanner;

public class GrabFirstCharacter {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String a=s.nextLine();
		char b=a.charAt(0);
		System.out.println("       ");
		System.out.println(a);
		System.out.println(b);
		s.close();		
		
		
		
	}

}
