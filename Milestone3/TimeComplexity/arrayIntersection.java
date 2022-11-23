package Milestone3.TimeComplexity;
import java.util.Arrays;
import java.util.Scanner;

public class arrayIntersection 
{

    public static int [] createArray(int x)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\nLength of Array:"+x);
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

    public static void testcase(int t)
    {
        

        for(int i=1;i<=t;i++)
        {
            System.out.println("\n\nTest Case :- "+i);
            int []arr1=createArray(1);
            int arr2[]=createArray(2);
            intersection(arr1, arr2);
            
        }

    }
    public static void main(String[] args) 
    {
        System.out.println("\n'This Program Demonstrates the Intersection of 2 Array' ");
        System.out.println("\n\nNo of Test Cases You want To Perform:");
        Scanner s=new Scanner(System.in);

        int t=s.nextInt();
        testcase(t);

        s.close();
    }
    public static void intersection(int [] arr1 , int [] arr2 )
    {

        if(arr1.length==0 || arr2.length==0)
        {
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0, j=0;
        int m=arr1.length , n=arr2.length;
      //  System.out.println();
        System.out.print("Answer is : ");
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else
            {
                
                System.out.print(arr2[j]+" ");
                i++;j++;
            }
        }
        System.out.println();
       
    
    }



    
}
