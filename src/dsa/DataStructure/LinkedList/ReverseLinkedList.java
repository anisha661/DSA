package dsa.DataStructure.LinkedList;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * */
public class ReverseLinkedList {

    public Node reverseLinkedList(Node head){
        Node prevNode = null;
        while(head !=null){
            Node nextNode = head.next;
            head.next = prevNode;
            prevNode = head ;
            head = nextNode;
        }
        return prevNode;
    }
}
