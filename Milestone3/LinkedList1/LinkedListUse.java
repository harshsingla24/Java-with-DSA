package Milestone3.LinkedList1;

//import java.util.Scanner;

public class LinkedListUse 
{
    public static void main(String[] args) 
    {

        Node<Integer> head = createLinkedList();

        System.out.println();
        //increment(head, 5);
        printLinkedList(head);
        printLength(head);    
        printIndexNode(head, 2);

        // Node<Integer> n1=new Node<>(10);
        // System.out.println(n1.data+" "+n1.next);

    }

    

    public static void printIndexNode(Node<Integer> head, int index) {
        Node<Integer> temp = head;
        int position = 0;

        while (temp != null && position <= index) {
            if (position == index) {
                System.out.println("\n"+"At index '"+index+ "' value is: " + temp.data);
                return;

            }
            position++;
            temp = temp.next;
        }

        System.out.println("\n"+"At index "+index+ " value is: "+ -1);
    }

    public static int printLength(Node<Integer> head) {
        Node<Integer> temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
      //  System.out.println("The Length of Linked List is : " + len);
        return len;
    
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;

        System.out.print("Linked List :- ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();

        // System.out.println(head);//address of head
        // System.out.println(head.data);//data of head

        // System.out.println(head.next);//address of 2nd node

        // System.out.println(head.next.data);//data of 2nd node

        // System.out.println(head.next.next);//address of 3rd node

        // System.out.println(head.next.next.data);//data of 3rd node

    }

    public static void increment(Node<Integer> head, int i) {
        Node<Integer> temp = head;

        while (temp != null) {
            temp.data = temp.data + i;
            temp = temp.next;

        }
        System.out.println("Every Node in Linked List is Incremented by " + i);

    }

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);

        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(-1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Node<Integer> head=n1;
        // return head;

        return n1;

    }

}
