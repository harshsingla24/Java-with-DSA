package Milestone3.Recursion_Assignment;

import java.util.Scanner;

public class sumOfDigits
{

    public static int SumOfDigits(int n)
    {
        
        

        if(n<10)
        {
            return n%10;
        }

       

        return (n%10)+SumOfDigits(n/10);
    }

    public static void main(String[] args) 
    {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(SumOfDigits(n));
    
        s.close();
     
    }
}