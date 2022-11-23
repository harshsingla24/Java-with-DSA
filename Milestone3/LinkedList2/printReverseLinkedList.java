package Milestone3.LinkedList2;

import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class printReverseLinkedList 
{


    public static void main(String[] args) 
    {

        Node<Integer> head= takeInputLinkedList.takeInput();
        System.out.println();
        PrintLinkedListRecursively(head);
        System.out.println();
        PrintReversedLinkedListRecursively(head);
    }
    

    

    public static void PrintReversedLinkedListRecursively(Node<Integer> head) 
    {
        if(head==null)
        {        
            return;
        }
        
        
        PrintReversedLinkedListRecursively(head.next);
        System.out.print(head.data+" ");


    }
    
    public static void PrintLinkedListRecursively(Node<Integer> head) 
    {
        if(head==null)
        {        
            return;
        }
        
        System.out.print(head.data+" ");
 
        PrintLinkedListRecursively(head.next);
       


    }
    


}
