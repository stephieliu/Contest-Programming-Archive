/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intvariables;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class IntVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = input.nextInt(
        );
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter another integer: ");
        b = input.nextInt(
        );
        
        int c;
        c = a + b;
        
        int d;
        d = a - b;
        
        int e;
        e = a * b;
        
        int f;
        f = a / b;
        
        int g;
        g = a % b;
        
        System.out.println("The sum is: " +c);
        System.out.println("The difference is: " + d);
        System.out.println("The product is: " +e);
        System.out.println("The quotient is: " +f);
        System.out.println("The modulus is: " +g);
        
    }
    
}
