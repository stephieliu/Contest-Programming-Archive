/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greaterthan;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class GreaterThan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt(
        );
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter another number: ");
        n = in.nextInt(
        );
        
        if (number > n){
            System.out.println("First number is greater than second number.");
        }else if(n > number){
            System.out.println("Second number is greater than first number.");
        }else  {
            System.out.println("Both numbers are equal.");
        }   
    }
    
}
