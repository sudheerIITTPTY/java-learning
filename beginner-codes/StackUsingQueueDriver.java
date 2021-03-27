/*
 *  Author : DSK
 *  This programing class is used to test StackUsingQueue class
 *
 *
 * */
public class StackUsingQueueDriver {
    public static void main(String[] args){
        StackUsingQueue stack = new StackUsingQueue();
        System.out.println(stack.pop());
        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
