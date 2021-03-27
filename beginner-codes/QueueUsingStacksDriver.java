/*
 *  Author : DSK
 *  This program is used to test QueueUsingStacks class
 *
 *
 * */
public class QueueUsingStacksDriver {
    public static void main(String[] args){
        QueueUsingStacks obj1 = new QueueUsingStacks();
        obj1.enQueue(10);
        System.out.println(obj1.deQueue());
        System.out.println(obj1.deQueue());

    }
}
