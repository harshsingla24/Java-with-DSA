package Milestone2.Strings;

import java.util.Scanner;

public class compresssTheString
{

	public static String CompressTheString(String str)
	{
		
	
		if(str.length()==0)
		{
			return null;
		}
		int StartIndex=0;
		int EndIndex=0;
		
		String CompresedString="";
		
		
		while(StartIndex<str.length())
		{
			while(EndIndex<str.length() && str.charAt(EndIndex)==str.charAt(StartIndex))
			{
				EndIndex++;
			}
			
			int TotalCharCount=EndIndex-StartIndex;
			
			if(TotalCharCount!=1)
			{
				CompresedString+=str.charAt(StartIndex)+""+TotalCharCount;
			}
			else
			{
				CompresedString+=str.charAt(StartIndex);
				
			}
			StartIndex=EndIndex;
			
			
			
		}
		return CompresedString;
		
		

	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(CompressTheString(str));
		
		
		s.close();
		
	}

}
