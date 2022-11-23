package Milestone3.Recursion_Assignment;

import java.util.Scanner;

public class checkAB 
{
    
    public static boolean CheckAB(String str)
    {
        if(str.length()==0)
        {
            return true;
        }

        if(str.charAt(0)=='a')
        {
            if(str.substring(1).length()>1 && str.substring(1,3).equals("bb"))
            {
                return CheckAB(str.substring(3));
            }
            else
            {
                return CheckAB(str.substring(1));

            }

        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String str=s.next();
        System.out.println(CheckAB(str));
        s.close();
    }
    
}
