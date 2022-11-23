package Milestone3.Recursion_Assignment;
import java.util.Scanner;
public class addStar
{
    
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        String str=s.next();
       System.out.println( PairStar(str));
       s.close(); 
    }

    
    public static String PairStar(String str)
    {
        
        if(str.length()<=1)
        {
           return str;
        }

        


        
        if(str.charAt(0)==str.charAt(1))
        {
           return str.charAt(0)+"*"+PairStar(str.substring(1)); 
        }
        else
        {
            return str.charAt(0)+PairStar(str.substring(1)); 
        }

        
               

    }

}