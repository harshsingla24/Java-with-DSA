package Milestone3.TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class pairSumInArray 
{

    public static void main(String[] args) 
    {

        System.out.println("Pair Sum");
        int arr[]=createArray();
     
        Scanner s=new Scanner(System.in);
        System.out.println("Number: ");
        int number=s.nextInt();
        s.close();
        System.out.println("Ans:-"+PairSumInArray(arr,number )); 
        System.out.println("Ans:-"+PairSumInArray1(arr, number));
        System.out.println("Ans:-"+PairSumInArray2(arr, number));
    }

    public static int PairSumInArray(int[] arr, int number) 
    { 
        // O(n * log(n)+log(n))
        Arrays.sort(arr);

        int startIndex=0;
        int endIndex=arr.length-1;
        int numPair=0;
 
    
        while(startIndex<endIndex)
        {
            if(arr[startIndex]+arr[endIndex]<number)
            {
                startIndex++;
            }
            else if(arr[startIndex]+arr[endIndex]>number)
            {
                endIndex--;
            } 
            else
            {
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];

                if(elementAtStart==elementAtEnd)
                {
                    int totalElementsFromStartToEnd=(endIndex-startIndex)+1;
                    numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }

                int tempStartIndex=startIndex+1;
                int tempEndIndex=endIndex-1;

                while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart)
                {
                    tempStartIndex++;
                }

                while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==elementAtEnd)
                {
                    tempEndIndex--;
                }

                int totalElementsFromStart=(tempStartIndex-startIndex);
                int totalElementsFromEnd=(endIndex-tempEndIndex);

                numPair+=totalElementsFromStart*totalElementsFromEnd;

                startIndex=tempStartIndex;
                endIndex=tempEndIndex;
            }

        }


        
       
        return numPair;
    }

    public static int PairSumInArray1(int[] arr, int number) 
    {
        //Brute Force Technique  O(n^2)



        int numPair =0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(number-arr[i]==arr[j] && i!=j )
                {
                    numPair++;
                }
            }

        }


        
        return numPair;
    }
    public static int PairSumInArray2(int []arr,int number) 
    {

         //Brute Force Technique  O(n^2)

        int numPair =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]+arr[j]==number)
                {
                    numPair++;
                }
                
            }
        
        }
        return numPair/2;




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
