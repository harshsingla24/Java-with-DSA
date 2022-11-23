package Milestone3.LinkedList2;

import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

import Milestone3.LinkedList1.LinkedListUse;

public class mergeTwoSortedLL {

    public static void main(String[] args) {

        System.out.println("Enter Sortedn Linked List and it will provide a new sorted list of their combination");
        System.out.println("First Linked List");
        Node<Integer> headLL1 = takeInputLinkedList.takeInput();

        System.out.println("Second Linked List");
        Node<Integer> headLL2 = takeInputLinkedList.takeInput();

        Node<Integer> head;
        head = mergeLL(headLL1, headLL2);
        LinkedListUse.printLinkedList(head);

    }

    public static Node<Integer> mergeLL(Node<Integer> headLL1, Node<Integer> headLL2) {

        if (headLL1 == null) {
            return headLL2;
        }
        if (headLL2 == null) {
            return headLL1;
        }
     
        Node<Integer> head = null, tail = null;
        Node<Integer> t1 = headLL1, t2 = headLL2;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }

        }

        if (t1 == null) {
            tail.next = t2;
        } else if (t2 == null) {
            tail.next = t1;
        }

        return head;

    }

}
