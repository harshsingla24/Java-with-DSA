package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;
import Milestone3.OOPS2_Exception.DoubleNode;
public class reverseLinkedListRecursive 
{

    


    public static void main(String[] args) 
    {
    
        Node<Integer> head= takeInputLinkedList.takeInput();
      
               
        head=ReverseLinkedListRecursive(head);
        LinkedListUse.printLinkedList(head);
        

        head=ReverseBetterLinkedListRecursive1(head);
        LinkedListUse.printLinkedList(head);
        
        
    }


    public static Node<Integer> ReverseBetterLinkedListRecursive1(Node<Integer> head) 
    {
        DoubleNode Doublehead=ReverseBetterLinkedListRecursive(head);
        return Doublehead.head;
    }



    public static DoubleNode ReverseBetterLinkedListRecursive(Node<Integer> head) 
    {

        DoubleNode ans;

        if(head==null || head.next==null)
        {
            ans= new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallAns =ReverseBetterLinkedListRecursive(head.next);
        smallAns.tail.next=head;
        head.next=null;
        
        ans=new DoubleNode();
        ans.head=smallAns.head;
        ans.tail=head;


        return ans;
        
    }



    
    public static Node<Integer> ReverseLinkedListRecursive(Node<Integer> head) 
    {


        if(head==null || head.next==null)
        {
            return head;
        }
        else
        {

            Node<Integer> smallHead;
            smallHead=ReverseLinkedListRecursive(head.next);//small head will save reverse linked starting from head.next

            //now  connect head or first node of main list to small's last node 
            //then this last node should point to null
            //then make small head point to head




            // O(n^2)
            // Node<Integer> tail = smallHead;
            // while (tail.next != null) 
            // {
            //     tail = tail.next;
            // }

            // tail.next=head;
            // head.next=null; // //tail.next.next=null;           
       
            // // or

            // O(n)
            head.next.next=head;//as 2nd element is now tail (last element of small  reversed list) and must point to first element of main list which is head 
            head.next=null;




            head=smallHead;
            return head;


        }

    }
    
}
