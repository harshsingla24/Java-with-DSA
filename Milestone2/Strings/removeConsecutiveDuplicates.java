package Milestone2.Strings;

import java.util.Scanner;

public class removeConsecutiveDuplicates {

	public static String RemoveConsecutiveDuplicates(String str)
	{
		
		String  orig ="";
		int m=0;
		orig=orig+str.charAt(m);
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)!=str.charAt(m))
			{
				orig=orig+str.charAt(i);
				m=i;
			}
		}
		return orig;
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println(RemoveConsecutiveDuplicates(str));
		
		
		s.close();
	}

}
