package Milestone3.LinkedList1;
public class print_ith_Node 
{

    public static void main(String[] args) 
    {
    Node<Integer> head= createLinkedList();
    printIndexNode(head, 4);


    }
    public static void printIndexNode(Node<Integer> head,int index)
    { 
        Node<Integer> temp = head;
        int position=0;

        while(temp!=null && position<=index) 
        {
            if(position==index)
            {
                System.out.println("\n"+temp.data);
                return;

            }
            position++;
            temp=temp.next;
        }

        System.out.println(-1);
    }
    
    
    public static Node<Integer> createLinkedList() 
    {
        Node<Integer> n1= new Node<>(3);
        Node<Integer> n2= new Node<>(4);
        Node<Integer> n3= new Node<>(5);
        Node<Integer> n4= new Node<>(2);
        Node<Integer> n5= new Node<>(6);
        Node<Integer> n6= new Node<>(1);
        Node<Integer> n7= new Node<>(9);
        Node<Integer> n8= new Node<>(-1);
        n1.next=n2;n2.next=n3;n3.next=n4;
        n4.next=n5;n5.next=n6;n6.next=n7;
        n7.next=n8;n8.next=null;



        return n1;
    }

   
    
}
