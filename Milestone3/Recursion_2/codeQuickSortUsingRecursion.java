package Milestone3.Recursion_2;

import java.util.Scanner;

public class codeQuickSortUsingRecursion 
{
    

    
    public static void main(String[]args)
    {
        int arr[]=createArray();
        //{6,3,4,5,1,3,2,9,8,7};


        quickSort(arr,0,arr.length-1);
        printArray(arr);
        



    }
    
    
    
    private static void quickSort(int[] arr, int si, int ei)
    { 
        if(si>=ei)
        {
            return;
        }

        int pivotIndex=partitionfn(arr,si,ei);
        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);

        
 
    }




    public static int partitionfn(int[] arr, int si, int ei) 
    {
        int pivotElement=arr[si];
        int smallerNumberCount=0;
        for(int i=si+1;i<=ei;i++)
        {
            if(arr[i]<pivotElement)
            {
                smallerNumberCount++;
            }
        }

        int temp=arr[si+smallerNumberCount];
        arr[si+smallerNumberCount]=arr[si];
        arr[si]=temp;


        


        int i=si,j=ei;
        while(i<j)
        {

            if(arr[i]<pivotElement)
            {
                i++;
            }
            else if(arr[j]>=pivotElement)
            {
                j--;
            }
            else
            {    
               
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;

                
            }
            
        }      
        return si+smallerNumberCount;
    
    
    
    
    
    }




    public static int[] createArray()
    {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Length of Array");
        int arr[]=new int[s.nextInt()];    
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the value for array at index "+i);
            arr[i]=s.nextInt();
        }
        s.close();
        return arr;




    }


    public static void  printArray(int arr[])
    {
        System.out.println("\nArray is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");




    }



    
}