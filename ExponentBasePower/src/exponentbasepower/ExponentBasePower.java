/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentbasepower;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class ExponentBasePower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a base: ");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.print("Enter a positive integer exponent: ");
        int exponent = input.nextInt();
        int product = base;
        int numberCount = 1;
        
        while (numberCount != exponent){
            numberCount++;
            product = product * base;
        }
        System.out.println(base + " to the power of " + exponent + 
                " is " + product);
    }
    
}
