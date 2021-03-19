/*
 *  Author : DSK
 *  This program read a number from user and display it
 *
 *
 * */
//importing scanner class
import java.util.Scanner;
public class SimpleUserInputClass {
    public static void main(String[] args){

        // creating scanner input object to read input from users
        Scanner input = new Scanner(System.in);

        // printing message to user
        System.out.println("Enter a number to display it : ");

        // reading input from user using scanner object
        int userInput = input.nextInt();

        //printing user entered number
        System.out.println("The Number you have entered is : " + userInput);
    }
}
