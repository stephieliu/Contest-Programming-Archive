/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypotenuse;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        a = input.nextDouble(
        );
        
        double b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the second side: ");
        b = in.nextDouble(
        );
        
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        
        System.out.println("The hypotenuse is " + c);
    }
    
}
