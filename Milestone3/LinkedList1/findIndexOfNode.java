package Milestone3.LinkedList1;

public class findIndexOfNode 
{
    public static void main(String[] args) 
    {
        Node<Integer> head= takeInputLinkedList.takeInput();
       
        LinkedListUse.printLinkedList(head);

        System.out.println(FindIndex(head, 5));
    }

    
    public static int FindIndex(Node<Integer> head,int value)
    {
        int currentIndex=0;
        Node<Integer> temp=head;

        while(temp!=null)
        {

            if(temp.data==value)
            {
                return currentIndex;
            }
            currentIndex++;
            temp=temp.next;
        }


        return -1;
        

       
        
    }
}
