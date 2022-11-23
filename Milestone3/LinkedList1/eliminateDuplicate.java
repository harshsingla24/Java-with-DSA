package Milestone3.LinkedList1;

public class eliminateDuplicate 
{

    public static Node<Integer>  ElminateDuplicate(Node<Integer> head)
    {
        Node<Integer> temp=head;

        while(temp.next!=null)
        {

            while(temp.data==temp.next.data)// && temp.next.next!=null)
            {
                temp.next=temp.next.next;
                if(temp.next.next==null)
                {
                    break;
                }
            }
            temp=temp.next;



        }
        return head;
    }

    public static Node<Integer>  ElminateDuplicate2(Node<Integer> head)
    {
        Node<Integer> temp=head;

        while(temp.next!=null)
        {

            if(temp.data==temp.next.data)
            {
               temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
    
    
    public static void main(String[] args) 
    {

        Node<Integer> head=takeInputLinkedList.takeInput();
        LinkedListUse.printLinkedList(head);

        head=ElminateDuplicate2(head);

        LinkedListUse.printLinkedList(head);

        
    }
    
}
