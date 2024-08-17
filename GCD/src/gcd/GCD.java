/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = input.nextInt();
        while(number2>0){
            int temp = number % number2;
            number = number2;
            number2 = temp;
        }
        System.out.println("The GCD is "+number);
    }
    
}
