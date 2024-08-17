/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author Stephie
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter a number :");
        number = input.nextInt();
        
        System.out.println("The number you entered is " + number);
    }
    
}
