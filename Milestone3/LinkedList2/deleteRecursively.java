package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class deleteRecursively 
{

    public static void main(String[] args) 
    {

        
        Node<Integer> head= takeInputLinkedList.takeInput();
      
      
      
        head=DeleteRecursively(head,1);

        LinkedListUse.printLinkedList(head);
        
    }

    public static Node<Integer> DeleteRecursively(Node<Integer> head, int index) 
    {
        if(index==0)
        {
            return head.next;
        }
        else if(index>=LinkedListUse.printLength(head))//length of linked list
        {
            return head;
        }
        else
        {          
            
            head.next= DeleteRecursively(head.next, index-1);

            return head;

        }



       
        
    }

    
}
