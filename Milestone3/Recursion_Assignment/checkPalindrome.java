package Milestone3.Recursion_Assignment;

public class checkPalindrome 
{

    public static boolean CheckPalindrome(String str )
    {
        if(str.length()<=1)
        {
            return true;
        }

        if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            return false;
        }
        else
        {
            return  CheckPalindrome(str.substring(1,str.length()-1));
        }

        
    }
    public static void main(String[] args) 
    {
        System.out.println(CheckPalindrome("abcba"));
        
    }

}
