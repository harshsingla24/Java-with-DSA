package Milestone2.Strings;

import java.util.Scanner;

public class removeCharacter {
	
	public static String RemoveCharacter(String str ,char x)
	{
		String newstr="";
		
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=x)
			{
				newstr=newstr+str.charAt(i);
			}
		}
		
		
		return newstr;
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		char x=s.next().charAt(0);
		
		System.out.println(RemoveCharacter(str, x));
		
		s.close();
	}

}
