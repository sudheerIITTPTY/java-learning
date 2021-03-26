/*
 *  Author : DSK
 *  This program is used to test the code written in PrintingArrayInReverseOrderDriver class
 *
 *
 * */
public class PrintingArrayInReverseOrderDriver {

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        PrintingArrayInReverseOrder obj = new PrintingArrayInReverseOrder(arr);
        obj.printArrayReverseUsingRecursion(arr.length-1);
        System.out.println(" ");
        obj.printArrayReverseUsingLoop();
    }

}
