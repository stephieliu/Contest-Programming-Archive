/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * use brackets for math operations in Java code
 */
package javaapplication25;
import java.util.Scanner;
/**
 *
 * @author Stephie
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner input;
        input = new Scanner(System.in);
        number = input.nextInt();
        
        number++;
        System.out.println("Answer: " + number);
    }
    
}
