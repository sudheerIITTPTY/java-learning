/*
 *  Author : DSK
 *  This program is a stack class implementing using 2 queues
 *
 *
 * */
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {

    private Queue<Integer> firstQueue;
    private Queue<Integer> secondQueue;

    public StackUsingQueue(){

        firstQueue = new LinkedList<Integer>();
        secondQueue = new LinkedList<Integer>();

    }

    public void push(int ele){
        secondQueue.add(ele);

        while(!firstQueue.isEmpty()){
            secondQueue.add(firstQueue.peek());
            firstQueue.remove();
        }

        Queue<Integer> temp = firstQueue;
        firstQueue = secondQueue;
        secondQueue = temp;

    }

    public int pop(){
        if(firstQueue.isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        int ele = firstQueue.peek();
        firstQueue.remove();
        return ele;
    }

    public int peek(){
        if(firstQueue.isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return firstQueue.peek();
    }


}
