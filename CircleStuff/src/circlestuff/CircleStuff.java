/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlestuff;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class CircleStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        r = input.nextDouble(
        );
        
        double c;
        c = 2 * r * Math.PI;
        
        double a;
        a = Math.pow(r, 2) * Math.PI;
        
        System.out.println("The circumference is: " + c);
        System.out.println("The area is: " + a);
    }
    
}
