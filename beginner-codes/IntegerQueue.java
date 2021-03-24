/*
 *  Author : DSK
 * This class is a Queue Data structure for integer datatype
 *
 * */
public class IntegerQueue {
    int front;
    int rear;
    int[] arr;
    int size;
    // default initializer for creating queue with 50 size
    public IntegerQueue(){
        this.front = 0;
        this.rear = 0;
        this.size = 50;
        this.arr = new int[this.size];
    }
    // initializer for creating a queue with given size
    public IntegerQueue(int size){
        this.front = 0;
        this.rear = 0;
        this.size = size;
        this.arr = new int[this.size];
    }
    // enqueue method for inserting an element into queue
    public  boolean enqueue(int ele){
        // checking queue is not full or not
        if((this.rear+1)%size == front){
            System.out.println("Queue Overflow");
            return false;
        }
        this.arr[this.rear] = ele;
        this.rear = (this.rear+1)%this.size;
        return true;
    }
    // dequeue method for removing and element from a queue
    public int dequeue(){
        // checking queue empty or not
         if(this.rear == this.front){
             System.out.println("Queue Underflow");
             return -1;
         }
         int ele = arr[this.front];
         this.front = (this.front + 1)%size;
         if(front == rear){
             front = 0;
             rear = 0;
         }
         return ele;
    }
}
