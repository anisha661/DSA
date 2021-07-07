package dsa.DataStructure.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public Node addTwoNumbers(Node l1, Node l2){

        //resultant linked list intialisation
        Node dummyHead = new Node(0);
        Node l3 = dummyHead;
        int carry = 0;
        while(l1 != null || l2 !=null){
            int l1Val = (l1 != null) ? l1.val : 0 ;
            int l2Val = (l2 != null) ? l2.val : 0 ;

            int sum = l1Val + l2Val + carry;
            carry = sum/10;
            int result = sum % 10;
            l3.next = new Node(result);

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            l3=l3.next;
        }

        if(carry > 0){
            l3.next = new Node(carry);
        }

        return dummyHead.next;
    }

}


