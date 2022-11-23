package Milestone2.Strings;

import java.util.Scanner;

public class checkPermutation {
	public static boolean CheckPermutation(String str1,String str2)
	{
	//check if both string are of same length or not	
		if(str1.length()!=str2.length())
		{
			return false;

		}

		//create array of length 256
		int [] frequency = new int[256];

		//assign 0 to  every Index in array
		for(int i=0;i<256;++i)
		{
			frequency[i]=0;
		}
		//update values of string 1 in array
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			++frequency[ch];

		}
		//update values of string 2 in array
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			--frequency[ch];
		}
		//check if the array value is zero or not

		for(int i=0;i<frequency.length;++i)
		{
			if(frequency[i]!=0)
			{
				return false;
			}
		}


		return true;
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {


		Scanner s=new Scanner (System.in);

		String str1=s.nextLine();
		String str2=s.nextLine();

		System.out.println(CheckPermutation(str1,str2));

		s.close();
	}

}
