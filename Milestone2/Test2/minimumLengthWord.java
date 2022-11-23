package Milestone2.Test2;

import java.util.Scanner;

public class minimumLengthWord 
{
	

    public static String minLengthWord(String input)

    {

        int minStart=-1;
        int minLength=Integer.MAX_VALUE;
        int currentStart=0;
        int i=0;
        for(;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            
            {
                int currentWordLength=i-currentStart;
                if(currentWordLength<minLength)
                {
                    minStart=currentStart;
                    minLength=currentWordLength;
                }
                currentStart=i+1;
            }
        }
        
        if(minStart==-1)
        
        {
            return input;
            
        }
        else
        {
             int currentWordLength=i-currentStart;
                if(currentWordLength<minLength)
                {
                    minStart=currentStart;
                    minLength=currentWordLength;
                }
        }
        
       return input.substring(minStart,minStart+minLength);



    }
    
    public static String takeInputString()
    {
    	Scanner s=new Scanner(System.in);
    	String input;
    	System.out.println("Enter the String");
    	input=s.nextLine();
    	
		s.close();
    	
    	return input;
    	
    }

	public static void main(String[] args)
	{
		System.out.println(minLengthWord(takeInputString()));		
	}

}
