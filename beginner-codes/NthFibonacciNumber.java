/*
 *  Author : DSK
 *  This program is to return nth fibonacci number
 *
 *
 * */
import java.util.Scanner;
//NthFibonacciNumber class
public class NthFibonacciNumber {
    int nthFiboNumber;
    int base1;
    int base2;
    //initializer
    public NthFibonacciNumber(){
        this.base1 = 0;
        this.base2 = 1;
    }
    //method for getting nth fibonacci number
    public int getNthFiboNumber(int n) {
        if(n==0)
            return base1;
        if(n==1)
            return base2;
        for(int i = 1;i<n;i++){
            nthFiboNumber = base1 + base2;
            base1 = base2;
            base2 = nthFiboNumber;
        }
        return nthFiboNumber;
    }
    //main program
    public static void main(String[] args){
        //creating scanner object for taking input
        Scanner input = new Scanner(System.in);
        //reading input from user using created scanner object
        int n = input.nextInt();
        //
        NthFibonacciNumber obj1 = new NthFibonacciNumber();

        System.out.println(obj1.getNthFiboNumber(n));
    }
}
