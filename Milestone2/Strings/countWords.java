package Milestone2.Strings;

import java.util.Scanner;

public class countWords {

	public static int CountWords(String str)
	{
		int count=0;
		if(str.length()==0)
		{
			return 0;
		}
		for(int i =0; i<str.length();i++)
		{
			if(str.charAt(i)==' ' || str.charAt(i)=='\n' ||str.charAt(i)=='\t')
			{
				count++;
			}
		}
		
		
		return count+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println(CountWords(str));
		s.close();
	}

}
