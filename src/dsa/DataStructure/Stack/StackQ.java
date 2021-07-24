package dsa.DataStructure.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue Implementation of Stack
 * */
public class StackQ {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int length;
    public StackQ(){
        length = 0;
    }

    public void push(int x){
        length++;
        //any new elements inserted are added to q2 to make sure that the added element is always at the front
        q2.add(x);
        while(!q1.isEmpty()){
            //All elements from q1 is dequeued and added to q2
            q2.add(q1.remove());
        }

        //Swapping the queues
        Queue<Integer> tempQ = q1;
        q1 = q2;
        q2 = tempQ;
    }

    public void pop(){
        if(q1.isEmpty()) return;
        q1.remove();
        length--;
    }

    public int top(){
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public int size(){
        return length;
    }
}
