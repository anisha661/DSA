package dsa.DataStructure.LinkedList;

public class Partition {

    public Node partition(Node head, int x){
        Node beforeList = new Node(0);
        Node before = beforeList;
        Node afterList = new Node(0);
        Node after = afterList;

        while(head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            }else {
                after.next = head;
                after = after.next;
            }
            head= head.next;
        }

        after.next = null;
        before.next = afterList.next;

        return beforeList.next;

    }
}
