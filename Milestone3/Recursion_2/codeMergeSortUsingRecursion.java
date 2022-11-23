package Milestone3.Recursion_2;

import java.util.Scanner;

public class codeMergeSortUsingRecursion 
{
    public static void mergeSort(int[]arr)
    {
        if(arr.length<=1)
        {
            return;
        }
       
        int arr1[]=new int[arr.length/2];
        int arr2[]=new int[arr.length-arr1.length];

        //arr is divided into arr1 &arr2
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=arr[arr1.length+i];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1,arr2,arr);



    } 
   
    
    public static void  merge(int arr1[],int arr2[],int arr[])
    {
        
        int i=0,j=0,k=0;


        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];
                i++;k++;
            }
            else if (arr2[j]<arr1[i])
            {
                arr[k]=arr2[j];
                j++;k++;

            }

        }

        while(i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;k++;
        }
        while(j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;k++;
        }

      
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

    public static void main(String []args) 
    {
        int arr[]=createArray();
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }

}


