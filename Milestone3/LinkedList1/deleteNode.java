package Milestone3.LinkedList1;

public class deleteNode 
{
    public static Node<Integer> DeleteNode(Node<Integer> head, int index) 
    {


        int len = LinkedListUse.printLength(head);

        if (index >= 0 && index < len) 
        {
            if (index == 0) 
            {
                head = head.next;
                return head;

            } 
            else
            {

                int currentindex = 0;
                Node<Integer> temp = head;
                while (temp != null) 
                {
                    if (currentindex == index - 1) 
                    {
                        temp.next = temp.next.next;
                        return head;
                    }

                    currentindex++;
                    temp = temp.next;
                }
                return head;
                
            }

        }
        else
        {
            System.out.println("Index not found");
            return head;

        }
       
        

    }

    public static void main(String[] args) 
    {
        Node<Integer> head = takeInputLinkedList.takeInput();
        LinkedListUse.printLinkedList(head);
        System.out.println();

        
        head = DeleteNode(head, 5);
        LinkedListUse.printLinkedList(head);
        System.out.println();


       
    }

}
