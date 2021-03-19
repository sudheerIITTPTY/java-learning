/*
*  Author : DSK
*  This program is written java to declare different types of variables
*
*
* */
public class VariableTypes {
    //instance variable
    int instanceVariable;
    //static variable
    static int count = 0;

    public VariableTypes(){
        count++;
        this.instanceVariable = 10;
    }

    public static void main(String[] args){
        //local variable
        int a = 10;
        //creating variable types class object
        VariableTypes v1 = new VariableTypes();
        //print different types of variables
        System.out.println(v1.instanceVariable);
        System.out.println(v1.count);
        System.out.println(a);
    }
}
