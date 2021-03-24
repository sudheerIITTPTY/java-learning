/*
 *  Author : DSK
 *  This class is used to test InfixToPostfix class by giving input as mathematical expression
 *
 *
 * */
import java.util.Scanner;
public class InfixToPostfixDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userInput = "1+2*3/(4-5)";
        InfixToPostfix obj1 = new InfixToPostfix(userInput);
        System.out.println("Infix Expression : " + userInput);
        System.out.println("Corresponding Postfix Expression : " + obj1.toPostfix());
    }
}
