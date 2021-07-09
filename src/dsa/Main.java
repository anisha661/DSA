package dsa;

import dsa.DataStructure.Array.DuplicatesSortedArray;
import dsa.DataStructure.Array.MaxConsecutiveOnes;
import dsa.DataStructure.Array.ValidMountainArray;
import dsa.DataStructure.LinkedList.AddTwoNumbers;
import dsa.DataStructure.LinkedList.MergeTwoSortedList;
import dsa.DataStructure.LinkedList.Node;
import dsa.DataStructure.LinkedList.ReverseLinkedList;
import dsa.DataStructure.Stack.ValidParenthesis;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0};
        System.out.println(m1.findMaxConsecutiveOnes(nums));

        //remove duplicates from sorted array
        DuplicatesSortedArray duplicatesSortedArray = new DuplicatesSortedArray();
        int[] nums2 = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
        System.out.println(duplicatesSortedArray.removeDuplicates(nums2));

        //Valid Parenthesis
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("[{(}]"));

        //Linked List
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(7);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        System.out.println(mergeTwoSortedList.mergeTwoLinkedList(head, head2));
        System.out.println(addTwoNumbers.addTwoNumbers(head, head2));

        //Valid Mountain array
        ValidMountainArray validMountainArray = new ValidMountainArray();
        int[] arr = new int[]{1, 2, 2, 3, 4, 2,0};
        System.out.println("Is valid?" + validMountainArray.isValidMountainArray(arr));

        //Reverse a linked list
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        System.out.println("reversed linked list : " + reverseLinkedList.reverseLinkedList(head));
    }

}
