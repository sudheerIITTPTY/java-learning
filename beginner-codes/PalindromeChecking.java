/*
 *  Author : DSK
 *  This program will take an input from user and print weather it is palindrome or not
 *
 *
 * */

import java.util.Scanner;
public class PalindromeChecking {
    int num;
    public PalindromeChecking(int num){
        this.num = num;
    }
    public boolean isPalindrome(){
        int temp = this.num;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        return rev == this.num;
    }
    public boolean isPalindrome(int num){
        this.num = num;
        return this.isPalindrome();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        PalindromeChecking obj = new PalindromeChecking(userInput);
        if(obj.isPalindrome())
            System.out.println("The given number " + userInput + " is a palindrome." );
        else
            System.out.println("The given number " + userInput + " is not a palindrome." );
    }
}
