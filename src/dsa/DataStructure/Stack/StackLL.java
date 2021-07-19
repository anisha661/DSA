package dsa.DataStructure.Stack;

import dsa.DataStructure.LinkedList.Node;
/**
 * Stack Implementation using Linked List
 * */
public class StackLL {

    private Node top;

    public StackLL(){
        top = null;
    }

    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if(top==null) return;
        top=top.next;
    }

    public int topOfStack(){
        return top.val;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
