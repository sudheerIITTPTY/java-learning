/*
 *  Author : DSK
 *  This program class contains 2 methods for printing array in reverse order
 *  1. using recursion
 *  2. using loop
 *
 *
 * */
public class PrintingArrayInReverseOrder {
    int[] arr;

    public PrintingArrayInReverseOrder(int[] arr){
        this.arr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            this.arr[i] = arr[i];
        }
    }
    public void printArrayReverseUsingRecursion(int i){
        if(i>=0){
            System.out.print(this.arr[i] + " ");
            printArrayReverseUsingRecursion(i-1);
        }
    }

    public void printArrayReverseUsingLoop(){
        for(int i = this.arr.length-1;i>=0;i--){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println("");
    }
}
