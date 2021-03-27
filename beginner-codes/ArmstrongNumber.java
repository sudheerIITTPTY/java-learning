/*
 *  Author : DSK
 *  This program will take an input from user and print weather it is armstrong or not
 *
 *
 * */
import java.util.Scanner;
public class ArmstrongNumber {
    int num;
    //initializer for armstrong number by taking input
    public ArmstrongNumber(int num){
        this.num = num;
    }

    //function for checking weather the given number is armstrong or not.
    public boolean isArmstrongNumber(){
        int temp = this.num;
        int res = 0;
        while(temp>0){
            int rem = temp%10;
            res +=  rem*rem*rem;
            temp /= 10;
        }
        return res == this.num;
    }
    //overloaded function with for checking armstrong or not by taking input
    public boolean isArmstrongNumber(int num){
        this.num = num;
        return isArmstrongNumber();
    }
    //main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        ArmstrongNumber obj = new ArmstrongNumber(userInput);
        if(obj.isArmstrongNumber())
            System.out.println("The number you have given " + userInput + " is an Armstrong number");
        else
            System.out.println("The number you have given " + userInput + " is not an Armstrong number");
    }
}
