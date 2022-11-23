package Milestone2.Strings;

import java.util.Scanner;

public class checkPalindromeHint {

	public static void checkPalindrome(String str)
	{
		int n=str.length();
		boolean isPalindrome = false;


		int x=0;int y=n-1;
		while(x<y) 
		{
			if(str.charAt(x)==str.charAt(y) )
			{
				isPalindrome=true;
				x++;y--;
			}
			else
			{
				isPalindrome=false;
				break;
			}
		}

		System.out.println(isPalindrome);



	}






	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		checkPalindrome(str);
		s.close();

	}

}
