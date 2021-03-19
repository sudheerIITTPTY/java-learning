/*
 *  Author : DSK
 *  This program read a number from user says weather it is even or odd
 *
 *
 * */
import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot {
    // instance variable
    int num;
    // initializer with input parameter
    public PrimeOrNot(int num){
        this.num = num;
    }
    //function to determine instance variable is prime or not
    public boolean isPrime(){
        if(this.num==1)
            return false;
        int count = 0;
        for(int i = 2;i<=Math.sqrt(this.num);i++){
            if(this.num%i==0)
                count++;
                break;
        }
        if(this.num==2 || count==0)
            return true;
        return false;
    }
    //main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to know weather it is Prime number or Not : ");
        int userInput = input.nextInt();
        PrimeOrNot obj1 = new PrimeOrNot(userInput);
        boolean isPrime = obj1.isPrime();
        if(isPrime)
            System.out.println(obj1.num + " is a prime number.");
        else
            System.out.println(obj1.num + " is not a prime number");
    }
}
