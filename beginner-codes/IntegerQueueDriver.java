/*
 *  Author : DSK
 * This class is to test IntegerQueueClass
 *
 * */
public class IntegerQueueDriver {
    public static void main(String[] args){
        IntegerQueue queue = new IntegerQueue(5);
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
