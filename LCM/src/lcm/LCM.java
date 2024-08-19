/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

/**
 *
 * @author Stephie
 */
//find LCM of two numbers
import java.util.Scanner;
public class LCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        
        if(number2==number1){
            System.out.print("The LCM is "+number2);
        }
     
                
         
        
    }
    
}
