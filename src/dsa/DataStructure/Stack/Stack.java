package dsa.DataStructure.Stack;

/**
 * Stack Implementation
 * */
public class Stack {
    private int array[];
    private int length;
    private int top;

    public Stack(int length){
        this.array = new int[length];
        this.length = length;
        this.top=-1;
    }

    public void push(int x){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = x;
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        top--;
    }

    public int topOfStack(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == length-1;
    }
}
