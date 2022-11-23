package Milestone3.Recursion_2;

import java.util.Scanner;

public class recursionWithStrings 
{
    public static String replaceChar(String str,char a, char b)
    {
        if(str.length()==0)
        {
            return str;
        }
        String smallOutput=replaceChar(str.substring(1), a, b);

        if(str.charAt(0)==a)
        {
            return b+smallOutput; 
        }    
        else
        {
            return str.charAt(0)+smallOutput;
        }
    } 
    
    

    public static String removeX(String str,char x)
    {
        if(str.length()==0)
        {
            return str;
        }
        String smallOutput=removeX(str.substring(1), x);
        if(str.charAt(0)==x)
        {
            return smallOutput;
        }
        else
        {
            return str.charAt(0)+smallOutput;
        }
    }


    public static String ReplacePI(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }

        if(str.charAt(0)=='p'&&str.charAt(1)=='i')
        {
            // call recursion on string of length n-2
        String smallOutput=ReplacePI(str.substring(2));
        return " 3.14 "+smallOutput;
        }
        else
        {
            // call recursion on string of length n-1   
            String smallOutput=ReplacePI(str.substring(1));
            return str.charAt(0)+smallOutput;
        }
       
    }

    public static String removeConsecutiveDuplicate(String str)
    {
        if(str.length()<=1)
        {
            return str;
        } 
        String smallOutput=removeConsecutiveDuplicate(str.substring(1));
        
        if(str.charAt(0)==str.charAt(1))
        {
            return smallOutput;
        }
        else
        {
          return  str.charAt(0)+smallOutput;
        }

      
    }

    public static int binarySearch(int[]arr, int si,int ei,int x)
    {
        //this will work for sorted arrays
        if(si>ei)
        {
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(arr[midIndex]==x)
        {
            return midIndex;
        }
        else if(arr[midIndex]<x)
        {
            return binarySearch(arr, midIndex+1, ei,x);
        }
        else
        {
            return binarySearch(arr, si, midIndex-1, x);
        }
    }

     public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println();
        System.out.println(replaceChar("abxfhxbhbfzjbzzxxdfczx", 'x', 'y'));
        System.out.println(removeX("abxfhxbhbfzjbzzxxdfczx", 'x'));
        System.out.println();
        System.out.println(ReplacePI("apipivvdvpihgvd"));
        System.out.println();
        System.out.println(removeConsecutiveDuplicate("xxxyyyzwwzzz"));
        System.out.println();
        int arr[]={1,3,5,7,9,11};
        System.out.println(binarySearch(arr, 0, arr.length-1, 8));
        System.out.println();
        s.close();
    }

}
