package Milestone3.LinkedList1;

import java.util.ArrayList;

public class removeConsecutiveDuplicate 
{

   
    
    public static ArrayList<Integer> RemoveConsecutiveDuplicate(int arr[])
    {
        ArrayList<Integer> result= new ArrayList<>();
        result.add(arr[0]);

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                result.add(arr[i]);
            }
        }

        return result;
    }



    public static void main(String[] args) 
    {
        int arr[]={10,10,20,20,20,30,40,10};
        ArrayList<Integer>result= RemoveConsecutiveDuplicate(arr);
        System.out.println();
        for(int i:result)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
