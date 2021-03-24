/*
 *  Author : DSK
 *  This program is used to test the solutions of the problems related to solve balanced parenthesis using stack data structure
 *
 *
 * */
import java.util.Scanner;
public class BalancedParenthesisProgramsDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String parenthesisInput = input.next();
        System.out.println(parenthesisInput);
        BalancedParenthesisPrograms obj = new BalancedParenthesisPrograms(parenthesisInput);
        if(obj.isParenthesisBalanced())
            System.out.println("Parenthesis Balanced");
        else
            System.out.println("Parenthesis is not Balanced");
    }
}
