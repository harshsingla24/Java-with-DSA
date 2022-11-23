package Milestone3.LinkedList1;

import java.util.ArrayList;

public class arrayListDemo 
{

    public static void main(String[] args) 
    {

        ArrayList<Integer>arr=new ArrayList<>(  );
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(2,80);
        // arr.remove(2);
        // Integer i=10;
        // arr.remove(i);
        arr.set(1, 50);
        System.out.println("\n"+arr.size());
        System.out.println(arr.get(1));


        for(int i=0;i<arr.size();i++)
        //i is iterating over indices of arr
        {
            
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
        System.out.println();


        
        
        for(int i:arr)
        // Enhanced for loop - for each element i in arr
        //i is iterating over elements of arr
        {
            System.out.print(i);
            System.out.print(" ");
        }
        
    }
}
