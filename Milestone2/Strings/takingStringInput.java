package Milestone2.Strings;

import java.util.Scanner;

public class takingStringInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		String str,str2;
		
		
		str=s.next();  
	
		
		System.out.println(str+"  "+str.length());
		
		
		str2=s.nextLine();
		
		System.out.println(str2+"  "+str2.length());
	
	
		s.close();
	}

}
