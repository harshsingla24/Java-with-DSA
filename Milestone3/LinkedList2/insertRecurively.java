package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class insertRecurively 
{

    
    public static Node<Integer> insertR(Node<Integer> head, int elem,int pos)
    {
        Node<Integer> NewNode = new Node<>(elem);
        if(head==null && pos>0)
        {
            return head;
        }
        if(pos==0)
        {

            NewNode.next=head;
            return NewNode;
            
        }
        else
        {
            // Node<Integer> smallerHead;
            // smallerHead= insertR(head.next, elem, pos-1);
            // head.next=smallerHead;

            head.next=insertR(head.next, elem, pos-1);
            return head;

        }
    }


    public static void main(String[] args) 
    {

        Node<Integer> head= takeInputLinkedList.takeInput();
      
      
        
        head=insertR(head,60,1);
        LinkedListUse.printLinkedList(head);
    }
    
}
