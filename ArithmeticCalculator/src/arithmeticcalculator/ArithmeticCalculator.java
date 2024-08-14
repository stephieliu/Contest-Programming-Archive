/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticcalculator;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class ArithmeticCalculator {

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
        while(true){
            System.out.print("Enter an arithmetic operator(or q to quit): ");
            operator = input.nextLine( 
            );
            
            
        
            if ("q".equals(operator)){
                System.out.println("Thank you, hope your calculations went well!");
                break;
            }
                System.out.print("Enter the first number: ");
                num1 = input.nextDouble();
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
                } else{
                    invalid = true;
                }
                if (invalid) {
                    System.out.println("Invalid Operator");
                }
                System.out.println("The result is " + result);
                
                
        }        
    }}

