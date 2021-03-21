/*
 *  Author : DSK
 *  This program is implementation of simple Integer Stack in java
 *
 *
 * */
public class IntegerStack {

    int stackArr[];
    int topIndex;
    int noOfElements;
    int stackSize;

    // default initializer for creating stack with default size 100
    public IntegerStack(){
        this.stackSize = 100;
        this.stackArr = new int[this.stackSize];
        this.topIndex = -1;
        this.noOfElements = 0;
    }

    // overloaded initializer for creating stack with input size from user
    public IntegerStack(int stackSize){
        this.stackSize = stackSize;
        this.stackArr = new int[stackSize];
        this.topIndex = -1;
        this.noOfElements = 0;
    }

    // push method is used to insert the element in the stack
    public boolean push(int ele){
        if(this.isFull()){
            System.out.println("Stack Overflow");
            return false;
        }
        this.topIndex++;
        this.stackArr[topIndex] = ele;
        return true;
    }

    // pop for removing and returning the element from the stack
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return topIndex;
        }
        int topEle = this.stackArr[topIndex];
        topIndex--;
        return topEle;
    }

    // top method is for return top element from the stack
    public int top(){
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return topIndex;
        }
        return this.stackArr[topIndex];
    }

    // method for checking weather the stack is full or not
    public boolean isFull(){
        return topIndex == this.stackSize-1;
    }

    // method for checking weather the stack is empty or not
    public boolean isEmpty(){
        return topIndex == -1;
    }
}
