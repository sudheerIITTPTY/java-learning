/*
 *  Author : DSK
 *  This class take a mathematical infix expression as a input and it will contain methods to convert into postfix expression
 *  and method for evaluation of postfix expression
 *
 *
 * */
import java.util.Stack;
public class InfixToPostfix {
    String expression;

    //initializer for infix to postfix class
    public InfixToPostfix(String expression){
        this.expression = expression;
    }

    // method for checking weather character is symbol or not
    public boolean isSymbol(char c){
        return c == '+' || c == '*' || c == '/' || c == '-' || c== '(' || c== ')';
    }

    // method for returning precedence of a symbol
    public int precedence(char c){
        if(c=='*' || c=='/')
            return 2;
        else if(c=='+' || c=='-')
            return 1;
        else
            return 3;
    }

    //method for converting infix to postfix expression
    public String toPostfix(){
        String postFixExpression = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i =0 ; i<this.expression.length();i++){
            char x = this.expression.charAt(i);
            if(this.isSymbol(x)){
                if(x==')'){
                    while(stack.peek()!='('){
                        postFixExpression = postFixExpression + stack.pop();
                    }
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()=='(' ||this.precedence(x) > this.precedence(stack.peek())){
                    stack.push(x);
                }
                else{
                    while(!stack.isEmpty() && this.precedence(x)<this.precedence(stack.peek())){
                        postFixExpression = postFixExpression + stack.pop();
                    }
                    stack.push(x);
                }

            }
            else{
                postFixExpression = postFixExpression + x;
            }
        }
        while(!stack.isEmpty())
            postFixExpression = postFixExpression + stack.pop();
        return postFixExpression;
    }
}
