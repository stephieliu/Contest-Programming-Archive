/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        if(number1>number2)
            System.out.printf("%d is larger\n", number1);
        if(number1<number2)
            System.out.printf("%d is larger\n", number2);
        if(number1 == number2)
            System.out.println("These numbers are equal\n");
    }
    
}
