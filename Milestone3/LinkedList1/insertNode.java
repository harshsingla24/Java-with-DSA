package Milestone3.LinkedList1;


public class insertNode 
{

    public static void main(String[] args) 
    
    {
        Node<Integer> head= takeInputLinkedList.takeInput();
       
        LinkedListUse.printLinkedList(head);
        head= InsertNode(head, 20, 0);
        LinkedListUse.printLinkedList(head);
    
    
    
    
    }


    public static Node<Integer> InsertNode(Node<Integer> head , int element,int index)
    {

        
        Node<Integer> currentNodeToBeAdded= new Node<>(element);
        
        Node<Integer> temp=head;
        int currentindex=0;

        if(index==0)
        {
            currentNodeToBeAdded.next=head;
            head=currentNodeToBeAdded;
            return head;
        }      
        else
        {
            while(temp!=null)
            {
                if (currentindex==index-1)
                {
                    currentNodeToBeAdded.next=temp.next;
                    temp.next=currentNodeToBeAdded;
                
                       
                    return head;
                }

                temp=temp.next;
                currentindex++;
            }        
        }
        System.out.println("This Index doesn't exists");
        return head;
    
    
    


    
    }


}
