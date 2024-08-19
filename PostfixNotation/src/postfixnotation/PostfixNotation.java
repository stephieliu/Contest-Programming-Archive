/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixnotation;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PostfixNotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String in = input.nextLine();
//        for(int i = 0; i<in.length(); i++){
//            if("*".equals(in.charAt(i))){
//                
//            }
//        }
        Scanner input = new Scanner(System.in);
        String expression[] = input.nextLine().split(" ");
        Stack<Double> myStack = new Stack<Double>();
        for(int i = 0; i < expression.length; i++){
            String tmp = expression[i];
            if(tmp.equals("+")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(op1+op2);
            }
            else if(tmp.equals("*")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(op1*op2);
            }
            else if(tmp.equals("-")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(op1-op2);
            }
            else if(tmp.equals("/")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(op1/op2);
            }
            else if(tmp.equals("^")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(Math.pow(op1,op2));
            }
            else if(tmp.equals("%")){
                double op2 = myStack.pop();
                double op1 = myStack.pop();
                myStack.push(op1%op2);
            }
            else{
                myStack.push(Double.parseDouble(tmp));
            }
        }
        System.out.println(myStack.pop());
    }
    
}
