package Milestone3.LinkedList2;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;
import Milestone3.LinkedList1.LinkedListUse;

public class mergeSortLL 
{


    public static Node<Integer> MergeSort(Node<Integer> head)
    {



        if(head==null || head.next==null)
        {
            return head;
        }


        Node<Integer> FirstHalf=head;//first node of LL is assigned as first half
        Node<Integer> Mid=midPointLL.MidPoint(head); //mid of LL
        Node<Integer> SecondHalf=Mid.next;//first node of second half from whole LL
        Mid.next=null;//disconnecting last node of first half with rest


        

        Node<Integer> 

        SolvedFirstHalf=MergeSort(FirstHalf),
        SolvedSecondHalf=MergeSort(SecondHalf);

        return mergeTwoSortedLL.mergeLL(SolvedFirstHalf,SolvedSecondHalf);

    }
    public static void main(String[] argStrings) 
    {

        System.out.println("\n\nEnter Unsorted Linked List");
        Node<Integer> head = takeInputLinkedList.takeInput();
        head=MergeSort(head);
        LinkedListUse.printLinkedList(head);
        
    }
    
}
