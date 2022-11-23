package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class evenAfterOddLL 
{

    public static void main(String[] args) {
        
        Node<Integer> head = takeInputLinkedList.takeInput();
       
        LinkedListUse.printLinkedList(head);
        
        Node<Integer> ans=EvenAfterOddLL(head);

        LinkedListUse.printLinkedList(ans);
     
        
    }

    public static Node<Integer> EvenAfterOddLL(Node<Integer> head) 
    {
        if(head==null)
        {
            return head;//Empty  LL
        }
        
        Node<Integer> temp=head;

        Node<Integer> 
        OH=null,OT=null,EH=null,ET=null;

        

        while(temp!=null)
        {
            if(temp.data%2==0)//Even Number
            {
                if(EH==null)
                {
                    EH=temp;
                    ET=temp;
                }
                else
                {
                    ET.next=temp;
                    ET=ET.next;
                }

            }
            else//Odd Number
            {
                if(OH==null)
                {
                    OH=temp;
                    OT=temp;
                }
                else
                {
                    
                    OT.next=temp;
                    OT=OT.next;

                }
            }

            temp=temp.next;
        }
        

        if(OH==null)
        {
            return EH;//as Odd LL isn't created so only even LL exists with its head and tail
        }
        else if(EH==null)
        {
            return OH;//as Even LL isn't created so only Odd LL exists with its head and tail
        }
        else
        {
            //both even and odd exists now break connection and seprate them by pointing their tails to null
            OT.next=null;//finishing Odd LL
            ET.next=null;//finishing Even LL


            //now individually odd and even exists so connect odd's tail with even's head

            OT.next=EH;
            return OH;
        }
        
    }
    
}
