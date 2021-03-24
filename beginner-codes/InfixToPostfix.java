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

    public InfixToPostfix(String expression){
        this.expression = expression;
    }

    public boolean isSymbol(char c){
        return c == '+' || c == '*' || c == '/' || c == '-' || c== '(' || c== ')';
    }

    public int precedence(char c){
        if(c=='*' || c=='/')
            return 2;
        else if(c=='+' || c=='-')
            return 1;
        else
            return 3;
    }

    public String toPostfix(){
        String postFixExpression = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i =0 ; i<this.expression.length();i++){
            char x = this.expression.charAt(i);
            if(this.isSymbol(x)){
                System.out.println(x);
                System.out.println(postFixExpression);
                if(x==')'){
                    while(stack.peek()!='('){
                        postFixExpression = postFixExpression + stack.pop();
                    }
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()!='(' ||this.precedence(x) > this.precedence(stack.peek())){
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
