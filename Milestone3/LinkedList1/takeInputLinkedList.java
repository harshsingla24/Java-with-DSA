package Milestone3.LinkedList1;
import java.util.Scanner;
public class takeInputLinkedList 
{




    public static Node<Integer> takeInput() 
    {

        //Its Time Complexity is O(n) 
        Scanner s = new Scanner(System.in);

        int data = s.nextInt();
        Node<Integer> head = null, tail=null;
        while (data != -1) 
        {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) 
            {
                // make it as head node and tail node
                head = currentNode;
                tail=currentNode;

            } 
            else 
            {
                tail.next=currentNode;
                tail=currentNode;   //or //tail=tail.next;
            }
            data = s.nextInt();
        }
        // s.close();

        return head;

    } 
   

 









    public static Node<Integer> takeinput() 
    {
        //Its Time Complexity is O(n^2)
        Scanner s = new Scanner(System.in);

        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) 
        {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) 
            {
                // make it as head node
                head = currentNode;

            } 
            else 
            {

                Node<Integer> tail = head;
                while (tail.next != null) 
                {
                    tail = tail.next;
                }

                // now tail will refer to last node
                // connect current node after last node
                tail.next=currentNode;

            }
            data = s.nextInt();
        }
        s.close();

        return head;

    } 





}
