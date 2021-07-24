package dsa.DataStructure.Queue;

import dsa.DataStructure.LinkedList.Node;

/**
 * Linked List Implementation of Queue
 * */
public class QueueLL {

    Node rear ;
    Node front;
    public QueueLL(){
        rear = null;
        front = null;
    }

    public void enqueue(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue(){
        if(front == null) {
            throw new RuntimeException("Queue is Empty");
        }
        if(front == rear){
            front =null;
            rear=null;
        }else{
            front = front.next;
        }
    }

    public boolean isEmpty(){
        return (front == null && rear == null);
    }
    public int front(){
        return front.val;
    }
}
