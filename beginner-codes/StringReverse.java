/*
 *  Author : DSK
 *  This java class is used to print reverse of a given string
 *
 *
 * */
import java.util.Scanner;
public class StringReverse {
    // string variable
    StringBuilder str;
    //String reverse class initializer
    public StringReverse(String input){
        str = new StringBuilder(input);
    }
    // printing the string
    public void printString(){
        System.out.println(this.str);
    }
    //function for reversing the given string
    public void reverseString(){
        char temp;
        for(int i = 0,j=this.str.length()-1;i<j;i++,j--){
            temp = this.str.charAt(i);
            this.str.setCharAt(i,this.str.charAt(j));
            this.str.setCharAt(j,temp);
        }
    }
    // main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        //creating String reverse obj
        StringReverse obj = new StringReverse(userInput);
        obj.printString();
        obj.reverseString();
        obj.printString();
    }

}
