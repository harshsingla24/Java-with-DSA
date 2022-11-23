package Milestone3.Recursion_1;

import java.util.Scanner;

public class stringToInteger
{
    public static int StringToInteger(String str)
    {
        if(str.length()==1)
        {
            return str.charAt(0)-'0';

        }

        int lastDigit=(str.charAt(str.length()-1))-'0';
        int smallOutput=StringToInteger(str.substring(0, str.length()-1));
       
       
        return smallOutput*10+lastDigit;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner (System.in);
        String str=s.nextLine();
        System.out.println(StringToInteger(str));

		s.close();
        
    }
    
}
