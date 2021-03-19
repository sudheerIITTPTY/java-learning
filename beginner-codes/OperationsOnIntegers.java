/*
 *  Author : DSK
 *  This program is to practice binary operators on 2 integers
 *
 *
 * */
public class OperationsOnIntegers {
    public static void main(String[] args){

        //declaring 2 integers
        int num1=10;
        int num2=3;

        //adding 2 integers
        int sum = num1 + num2;

        //difference 2 integers
        int diff = num1 - num2;

        //multiplication of 2 integers
        int prod = num1 * num2;

        //division of 2 integers
        int div = num1 / num2;

        //reminder of 2 integers
        int rem = num1 % num2;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("Sum of num1 and num2 "+ sum);
        System.out.println("Diff of num1 and num2 " + diff);
        System.out.println("Product of num1 and num2 " + prod);
        System.out.println("Division of num1 and num2 "+div);
        System.out.println("Remainder if num2 divides num1 "+rem);

    }
}
