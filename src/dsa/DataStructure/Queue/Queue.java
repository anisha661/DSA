package dsa.DataStructure.Queue;

/**
 * Array Implementation of Queue
 * */
public class Queue {

    int A[];
    int length;
    int front;
    int rear;

    public Queue(int length){
        this.A = new int[length];
        this.length = length;
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public boolean isFull(){
        return (rear + 1) % length == front;
    }
    public void enqueue(int x){
        if(isFull()){
            throw new RuntimeException("Queue is full!");
        }else if(isEmpty()){
            front = rear = 0;
        }else{
            rear = (rear+1)%length;
        }
        A[rear] = x;
    }

    public void dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }else if(front == rear){
            front = rear = 1;
        }else{
            front = (front + 1) % length;
        }
    }

    public int front(){
        return A[front];
    }
}
