/*
 *  Author : DSK
 *  This program is used to implement Queue using stacks
 *
 *
 * */
import java.util.Stack;
public class QueueUsingStacks {

    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public QueueUsingStacks(){
        firstStack = new Stack<Integer>();
        secondStack = new Stack<Integer>();
    }

    public void enQueue(int ele){
        firstStack.push(ele);
    }
    public int deQueue(){
        if(firstStack.isEmpty() && secondStack.isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }

        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.peek());
                firstStack.pop();
            }
        }
         int ele = secondStack.peek();
        secondStack.pop();

        return ele;

    }
}
