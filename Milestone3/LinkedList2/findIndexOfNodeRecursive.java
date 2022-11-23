package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class findIndexOfNodeRecursive 
{

    public static void main(String[] args) {
        
        
        Node<Integer> head = takeInputLinkedList.takeInput();
        int ans=findNodeRecursive(head,100);

        LinkedListUse.printLinkedList(head);
        System.out.println(ans);

    }

    public static int findNodeRecursive(Node<Integer> head, int value) {

        if(head==null){
            return -1;
        }
        if(head.data==value)
        {
            return 0;
        }


        int smallAns=findNodeRecursive(head.next, value);

        if(smallAns==-1)
        {
            return -1;
        }

        return smallAns+1;
    }
}
