package Milestone3.LinkedList2;

import java.util.LinkedList;

public class CollectionsLinkedList 
{
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1,100);
        System.out.println(list.get(1));
        list.set(1, 200);
        list.addFirst(80);
        list.addLast(90);///same as add
        System.out.println(list.size());
        list.remove();//removes integer of 0th index
        list.remove(2);//removes the index value as you specified
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
           
        }
        System.out.println(" ");  
        System.out.println(list.isEmpty());
    
    
    }

    
}
