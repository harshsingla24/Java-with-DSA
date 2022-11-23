package Milestone3.LinkedList1;

public class appendLastNToFirst 
{

    public static Node<Integer>  AppendLastNToFirst(Node<Integer> head, int N) 
    {
        //indexing starts from 1 to length
        

        
        //X= lenght of LL - N(Number by which u need to shift)
        int X=LinkedListUse.printLength(head)-N;
        Node<Integer> temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }//here we reach at last node of LL
        temp.next=head; //'last node' has 'null' then i update it to 'head' now 'last node' is connected with 'first' like a loop

        temp=head;//as 'temp' was at last node because of above while loop so make 'temp' point to 'head' again

        int count=1;//I made indexing from 1 for my convenience
        while(count!=X)//by this loop I made 'temp' to point at 'X position'
        {
            temp=temp.next;

            count++;
        }
        head=temp.next; //the 'X+1' node must be the head
        temp.next=null; //the 'X th' node must be null as this is the tail of our LL

        return head;

    }





    public static void main(String[] args) 
    {

        Node<Integer> head= takeInputLinkedList.takeInput();
       
        LinkedListUse.printLinkedList(head);

        head=AppendLastNToFirst(head, 4);
        LinkedListUse.printLinkedList(head);
        
    }
    
}
