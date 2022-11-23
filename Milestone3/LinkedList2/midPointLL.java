package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class midPointLL 
{


    
    public static void main(String[] args) 
    {


        
        Node<Integer> head= takeInputLinkedList.takeInput();
      
        LinkedListUse.printLinkedList(head);
        LinkedListUse.printLinkedList(MidPoint(head));
        
        
    }

    

    public static Node<Integer> MidPoint(Node<Integer> head) 
    {

        Node<Integer> slow=head;
       
        Node<Integer> fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }



        return slow;
    }
    
}
