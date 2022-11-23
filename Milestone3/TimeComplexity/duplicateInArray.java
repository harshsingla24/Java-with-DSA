package Milestone3.TimeComplexity;
import java.util.Arrays;
import java.util.Scanner;



public class duplicateInArray 
{
    

    public static int DuplicateInArray(int []arr)
    {
       
        

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                if(arr[i]==arr[i+1])
                {
                    return arr[i];
                }
              
            }
            
            
        }

        return -1;      
       
        



    }
    public static void main(String[] args) 
    {
      int arr[]=createArray();  
      System.out.println("Ans:-"+DuplicateInArray(arr));

        



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
