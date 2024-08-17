/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreemeasures;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class DegreeMeasures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree measure in Fahrenheit: ");
        f = input.nextDouble(
        );
        
        double c;
        c = (f-32)*5/9;
        
        System.out.println("The degrees is " + c + "degrees Celsius.");
    }
    
}
