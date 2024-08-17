/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        String operator;
        double result = 0;
        boolean invalid = false;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter an arithmetic operator: ");
        operator = input.next();
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else if (operator.equals("^")) {
            result = Math.pow(num1, num2);
        } else {
            invalid = true;
        }
        
        if (invalid) {
            System.out.println("Invalid Operator");
        } else {
            System.out.println("The result is " + result);
        }      
    }
    
}
