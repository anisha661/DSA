package dsa.DataStructure.LinkedList;
/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following
 * the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 4
 * Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * */
public class LinkedListCycle {

    public boolean hasCycle(Node head){
        if(head == null) return false;

        //Two pointer Approach
        Node fast = head.next;
        Node slow = head;

        while(slow != fast){

            if(fast == null || fast.next == null) {
                return false;
            }
            fast = head.next.next;
            slow=head.next;
        }
        return true;
    }
}
