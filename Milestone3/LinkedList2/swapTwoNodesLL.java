package Milestone3.LinkedList2;

import java.util.Scanner;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class swapTwoNodesLL 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        

        System.out.println("Enter Linked List");
        Node<Integer> head = takeInputLinkedList.takeInput();      
        System.out.println("Enter Index i & Index j  which u need to swap");
        head = SwapNode(head, s.nextInt(),s.nextInt());
        LinkedListUse.printLinkedList(head);
        System.out.println();
        s.close();

    }

    public static Node<Integer> SwapNode(Node<Integer> head, int a, int b) 
    {

        if (a == b) 
        {
            return head;
        }


        Node<Integer> 
        temp = head,
        C1 = null, C2 = null,// Current // need to be swaped
        P1 = null, P2 = null;// Previous
        int x = 0;
        while (temp != null) 
        {

            if (x == a - 1) //looks for previous 1 if found then gives current 1
            {
                //as a=0 this condition is never true
                P1 = temp;
                C1 = P1.next;
    
            }
            if (x == b - 1) //looks for previous 2 if found then gives current 2
            {
                P2 = temp;
                C2 = P2.next;
            }
            if(a==0)
            {
                C1=head;//head is current 1 as previous 1 doesn't exists

            }
            temp = temp.next;
            x++;
        }

        // Actual Swap Code

        if(a==0)
        {
            Node<Integer> t=null;
           
            t=C1.next;
            C1.next=C2.next;
            P2.next=C1;
            C2.next=t;
            head=C2;
        }
        else
        {
            P1.next = C2;
            P2.next = C1;
            Node<Integer> t = C1.next;
            C1.next = C2.next;
            C2.next = t;
        }

        
        // LinkedListUse.printLinkedList(P1);
        // LinkedListUse.printLinkedList(C1);
        // LinkedListUse.printLinkedList(P2);
        // LinkedListUse.printLinkedList(C2);

        return head;
    }

}
