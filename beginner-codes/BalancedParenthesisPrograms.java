/*
 *  Author : DSK
 *  This program is used to solve problems related to solve balanced parenthesis using stack data structure
 *
 *
 * */
import java.util.Stack;
public class BalancedParenthesisPrograms {
    String parenthesisOrder;
    public BalancedParenthesisPrograms(String input){
        parenthesisOrder = input;
    }

    //method for checking parenthesis balanced or not if input contains ()[]{}
    public boolean isParenthesisBalanced(){
        Stack<Character> stack = new Stack<Character>();
        int n = this.parenthesisOrder.length();
        for(int i =0;i<this.parenthesisOrder.length();i++){
            switch(this.parenthesisOrder.charAt(i)){
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else
                        return false;
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }
                    else
                        return false;
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else
                        return false;
                    break;
                default:
                    continue;
            }
        }
        return stack.isEmpty();
    }
}
