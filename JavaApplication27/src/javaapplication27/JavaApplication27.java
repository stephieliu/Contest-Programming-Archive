/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int integer;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        integer = input.nextInt();
       
        
        if (integer%2 == 0){
            System.out.println("The integer is even.");
        }else{
            System.out.println("The integer is odd.");
        }
    }
    
}
