package dsa.DataStructure.LinkedList;

import java.util.LinkedList;
/**
 * Merge two sorted linked lists and return it as a sorted list.
 * */
public class MergeTwoSortedList {

    public Node mergeTwoLinkedList(Node L1,Node L2){
        if(L1==null) return L2;
        if(L2==null) return L1;

        Node L3 = null;
        if(L1.val < L2.val){
            L3 = L1;
            L1=L1.next;
        }else{
            L3 = L2;
            L2=L2.next;
        }

        Node current = L3;
        while(L1!=null && L2!=null){
            if(L1.val < L2.val){
                current.next = L1;
                L1=L1.next;
            }else{
                current.next = L2;
                L2=L2.next;
            }
            return current = current.next;
        }

        if(L1 == null){
            current.next = L2;
        }else{
            current.next = L1;
        }

        return L3;
    }
}
