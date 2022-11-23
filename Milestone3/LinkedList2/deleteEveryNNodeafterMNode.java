package Milestone3.LinkedList2;

import Milestone3.LinkedList1.LinkedListUse;
import Milestone3.LinkedList1.Node;
import Milestone3.LinkedList1.takeInputLinkedList;

public class deleteEveryNNodeafterMNode 
{

    public static void main(String[] args) 
    {
        Node<Integer> head = takeInputLinkedList.takeInput();

        head = DeleteEveryskipodeafterMNode(head, 0, 1);

        LinkedListUse.printLinkedList(head);
    }

    public static Node<Integer> DeleteEveryskipodeafterMNode(Node<Integer> head, int M, int N) 
    {
       
        if(M==0 || head==null){return null;}
        if(N==0){return head;}

        

        Node<Integer> currentNode=head,temp=null;
        
        while(currentNode!=null)
        {
            int take=0;
            int skip=0;
            while(currentNode!=null && take<M)
            {


                if(temp==null)
                {
                    temp=currentNode;
                }
                else
                {
                    temp.next=currentNode;
                    temp=currentNode;           
                }

                currentNode=currentNode.next;
                take++;
            }
            while(currentNode!=null && skip<N)
            {
                currentNode=currentNode.next;
                skip++; 
            }
        }
        if(temp!=null)
        {
            temp.next=null;
        }
        return head;
    }
}


    //         while(take<M & currentNode!=null)
    //         {
    //             if(currentNode!=null)
    //             {
    //                 currentNode=currentNode.next;
    //             }
    //             take++;
               
    //         }
    //         currentNode=currentNode.next;
            
    //         while(skip<=n && currentNode!=null)
    //         {
    //             if(currentNode!=null)
    //             {
    //                 currentNode.next=currentNode.next.next;
    //                 currentNode=currentNode.next;
    //             }
    //             skip++;
    //         }
    //         take=1;
    //         skip=1;
            

    //     }
              
    //     return head;
    // }

