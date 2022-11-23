package Milestone2.Strings;

import java.util.Scanner;

public class reverseStringWordWise {

	public static String ReverseStringWordWise(String str)
	{

		//if question is 
		//abc def ghi
		//and Expected Output is 
		//ghi def abc

		////Step-1

		//First reverse whole String 
		//Example:-  abc def ghi
		//           ihg fed cba

		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}





		////Step-2
		//Now Reverse Each Word
		// ihg fed cba
		// ghi def abc



		String ans="";
		int CurrentWordStart=0;
		int i=0;
		for(;i<str1.length();i++)
		{

			if(str1.charAt(i)==' ')
			{
				int CurrentWordEnd=i-1;
				String ReverseWord="";
				for(int j=CurrentWordStart;j<=CurrentWordEnd;j++)
				{
					ReverseWord=str1.charAt(j)+ReverseWord;
				}
				ans=ans+ReverseWord+" ";
				CurrentWordStart=i+1;
			}


		}
		
		//Only for Last Word
		int CurrentWordEnd=i-1;
		String ReverseWord="";
		for(int j=CurrentWordStart;j<=CurrentWordEnd;j++)
		{
			ReverseWord=str1.charAt(j)+ReverseWord;
		}
		ans=ans+ReverseWord+" ";







		return ans;





	}


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);


		String str=new String(s.nextLine());
		System.out.println(ReverseStringWordWise(str));
		s.close();
	}

}
