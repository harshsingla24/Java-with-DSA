package Milestone3.TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class findTheUniqueElement
{
    public static void main(String[] args) 
    {

        int arr[]=createArray();

       FindTheUniqueElement(arr);
       findUnique(arr);
       
       

    }   
    
   public static void findUnique(int arr[])
    {    
        int XOR=0;
        for(int i=0;i<arr.length;i++)
        {
            XOR=XOR^arr[i];
        }
        System.out.println("Ans:-"+XOR);



    }
  
   

    public static void FindTheUniqueElement(int[] arr) 
    {

       
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                if(arr[i]==arr[i+1] && i< arr.length-1)//it creates index bound issue
               {
                  i++;
               }
                else
                {
                    System.out.println("Ans:-"+arr[i]); 
                }
            }
            else
            {
                System.out.println("Ans:-"+arr[i]); 
            }


        }



        
    }



    public static int [] createArray()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\nLength of Array:");
        int n= s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Value at Index: "+i);
            arr[i]=s.nextInt();
        }
        s.close();
        return arr;





    }





    
}
