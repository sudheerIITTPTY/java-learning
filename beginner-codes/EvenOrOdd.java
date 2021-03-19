/*
 *  Author : DSK
 *  This program read a number from user says weather it is even or odd
 *
 *
 * */
import java.util.Scanner;
public class EvenOrOdd{
    //instance variable
    int num;
    //initializer with parameter
    public EvenOrOdd(int num){
        this.num = num;
    }
    //function to return weather it is even or odd in boolean value true or false
    public boolean isEven(){
        return this.num % 2 == 0;
    }
    //main function
    public static void main(String[] args){
        //scanner object creation for reading input from user
        Scanner input = new Scanner(System.in);
        //printing message to user for asking input
        System.out.println("Enter a Number to know weather it is Even or Odd : ");
        //reading input from user
        int user_input = input.nextInt();
        //creating EvenOrOdd obj by initializing with user input
        EvenOrOdd obj1 = new EvenOrOdd(user_input);
        //checking user input even or odd using isEven method
        boolean isEven = obj1.isEven();
        //printing output using if else statement
        if(isEven){
            System.out.println(obj1.num + " is Even Number");
        }
        else {
            System.out.println(obj1.num + " is Odd Number");
        }
    }
}