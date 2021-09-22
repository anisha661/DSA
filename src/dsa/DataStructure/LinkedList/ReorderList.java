package dsa.DataStructure.LinkedList;

public class ReorderList {


    public void reorderList(Node head){
        if(head == null || head.next == null)
            return ;

        //head of first half
        Node l1 = head;

        //head of second half
        Node slow = head;

        //tail of second half
        Node fast = head;

        //tail of first half
        Node prev = null;

        while(fast!=null && fast.next != null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next = null;
        Node l2 = reverse(slow);
        merge(l1,l2);
    }


    public Node reverse(Node head){
        Node prev = null;
        Node current_node = head;

        while(current_node != null){
            Node next_node = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node=next_node;
        }
        return prev;
    }

    public void merge(Node l1, Node l2){
        while(l1!=null){
            Node l1Next = l1.next;
            Node l2Next = l2.next;
            l1.next = l2;

            if(l1Next == null){
                break;
            }
            l2.next = l1Next;
            l1 = l1Next;
            l2=l2Next;
        }
    }
}
