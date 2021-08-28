package dsa.DataStructure.LinkedList;
/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * */
public class RemoveNthNode {

    public Node removeNthNodeFromTheList(Node head, int n ){
        Node dummyNode = new Node(0);
        dummyNode.next = head;

        Node fast = dummyNode;
        Node slow = dummyNode;

        for(int i = 0;i<=n;i++){
            fast =  fast.next;
        }

        while(fast != null){
            slow= slow.next;
            fast= fast.next;
        }
        slow.next = slow.next.next;

        return dummyNode.next;

    }
}
