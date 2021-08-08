package dsa;

import dsa.DataStructure.Array.DuplicatesSortedArray;
import dsa.DataStructure.Array.MaxConsecutiveOnes;
import dsa.DataStructure.Array.NAndItsDouble;
import dsa.DataStructure.Array.ValidMountainArray;
import dsa.DataStructure.LinkedList.AddTwoNumbers;
import dsa.DataStructure.LinkedList.MergeTwoSortedList;
import dsa.DataStructure.LinkedList.Node;
import dsa.DataStructure.LinkedList.ReverseLinkedList;
import dsa.DataStructure.Queue.Queue;
import dsa.DataStructure.Stack.InfixToPostFix;
import dsa.DataStructure.Stack.Stack;
import dsa.DataStructure.Stack.StackLL;
import dsa.DataStructure.Stack.ValidParenthesis;
import dsa.DataStructure.String.ReverseVowels;
import dsa.DataStructure.String.ShuffleString;
import dsa.DataStructure.String.ValidPalindrome;
import dsa.DataStructure.Tree.*;
import dsa.Maths.CountPrimes;
import dsa.Maths.HappyNumber;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
//        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0};
//        System.out.println(m1.findMaxConsecutiveOnes(nums));
//
//        //remove duplicates from sorted array
//        DuplicatesSortedArray duplicatesSortedArray = new DuplicatesSortedArray();
//        int[] nums2 = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
//        System.out.println(duplicatesSortedArray.removeDuplicates(nums2));
//
//        //Valid Parenthesis
//        ValidParenthesis validParenthesis = new ValidParenthesis();
//        System.out.println(validParenthesis.isValid("[{(}]"));
//
//        //Linked List
//        Node head = new Node(2);
//        head.next = new Node(4);
//        head.next.next = new Node(6);
//
//        Node head2 = new Node(1);
//        head2.next = new Node(2);
//        head2.next.next = new Node(5);
//        head2.next.next.next = new Node(7);
//
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
//        System.out.println(mergeTwoSortedList.mergeTwoLinkedList(head, head2));
//        System.out.println(addTwoNumbers.addTwoNumbers(head, head2));
//
//        //Valid Mountain array
//        ValidMountainArray validMountainArray = new ValidMountainArray();
//        int[] arr = new int[]{1, 2, 2, 3, 4, 2,0};
//        System.out.println("Is valid?" + validMountainArray.isValidMountainArray(arr));
//
//        //Reverse a linked list
//        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
//        System.out.println("reversed linked list : " + reverseLinkedList.reverseLinkedList(head));
//
//        //Reverse Vowels of a String
//        ReverseVowels reverseVowels = new ReverseVowels();
//        System.out.println("Reverse a string : "+reverseVowels.reverseVowelsOfString("Simultaneous"));
//
//        //Valid Palindrome
//        ValidPalindrome validPalindrome = new ValidPalindrome();
//        System.out.println("Is palindrome"+validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
//
//
//        NAndItsDouble nAndItsDouble = new NAndItsDouble();
//        int[] arr2 = new int[]{10,2,0,2};
//        System.out.println("Double exists : " +  nAndItsDouble.checkIfExist(arr2));
//
//
//        //Stack Implementation
//        Stack stack = new Stack(10);
//        stack.push(1);
//        stack.push(5);
//        stack.push(4);
//        stack.pop();
//        System.out.println("Top of Stack is : "+ stack.topOfStack());
//
//
//        StackLL stackLL = new StackLL();
//        stackLL.push(4);
//        stackLL.push(10);
//        stackLL.push(55);
//        stackLL.pop();
//        System.out.println("Stack Implemetation using Linked List : " + stackLL.topOfStack());
//
//
//        //infix to Postfix
//        InfixToPostFix infixToPostFix = new InfixToPostFix();
//        System.out.println("Infix to postfix: "+ infixToPostFix.postfixConversion("(a+b)*(c-d/e)"));
//
//        //Queue
//        Queue queue = new Queue(10);
//        queue.enqueue(2);
//        queue.enqueue(5);
//        queue.enqueue(7);
//        queue.dequeue();
//        System.out.println("Queue" + queue.front());
//
//
//        //Shuffle String
//        ShuffleString ss = new ShuffleString();
//        System.out.println("Shuffled String is : " + ss.shuffleString("niasha", new int[]{1,2,0,3,4,5}));
//
//
//        //Happy Number
//        HappyNumber happyNumber = new HappyNumber();
//        System.out.println(happyNumber.isHappy(12));
//
//        CountPrimes countPrimes = new CountPrimes();
//        System.out.println("primes"+ countPrimes.noOfPrimes(10));

        NodeT root = new NodeT(12);
        root.left = new NodeT(10);
        root.right = new NodeT(15);
        root.left.left = new NodeT(8);
        root.left.right = new NodeT(11);
        root.right.right = new NodeT(17);
        DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
        depthFirstTraversal.inOrder(root);
        BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
        breadthFirstTraversal.breadthFirstTraversal(root);

        CheckForBST checkForBST = new CheckForBST();
        System.out.println(checkForBST.isBST(root));


        KthSmallest kthSmallest = new KthSmallest();
        System.out.println(kthSmallest.findKthSmallestFromBST(root, 2));
    }

}
