package Milestone3.TimeComplexity;

import java.util.Scanner;

public class arrayEquilibriumIndex 
{
    public static int EquilibriumIndex(int arr[])
    {
        int ans=-1;

        int ls=0;
        int rs=0;

        for(int i=0;i<arr.length;i++)
        {
            rs+=arr[i];

        }

        for(int i=0;i<arr.length;i++)
        {
            
            rs-=arr[i];
            if(i!=0)
            {
                ls+=arr[i-1];
            }

            if(ls==rs)
            {
                ans=i;
            }
        }

        return ans;   
        
        




    }
    




    public static void main(String[] args)
    {
        
        int arr[]=createArray();
        System.out.print("\nAns: ");
        System.out.println(EquilibriumIndex(arr));


        
        
    }





    public static int[] createArray() 
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Length of Aarray:-");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Value at Index "+i);
            arr[i]=s.nextInt();
        }
        s.close();
        return arr;




    }
    
}

