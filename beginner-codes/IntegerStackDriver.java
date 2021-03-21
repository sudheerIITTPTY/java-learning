import java.util.Stack;

/*
 *  Author : DSK
 *  This program is implementation for checking IntegerStack class
 *
 *
 * */
public class IntegerStackDriver {
    public static void main(String[] args){
        IntegerStack stack = new IntegerStack(10);
        for(int i = 0;i<=10;i++)
            stack.push(10-i);
        for(int i = 0;i<=10;i++)
            stack.pop();

    }
}
