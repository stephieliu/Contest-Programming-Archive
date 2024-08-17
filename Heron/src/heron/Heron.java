/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heron;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Heron {

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
        System.out.print("Enter the second  side: ");
        b = in.nextDouble(
        );
        
        double c;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the third side: ");
        c = i.nextDouble(
        );
        
        double s;
        s = (a + b + c)/2;
        
        double area;
        area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
        
        System.out.println("The area is: " + area);
    }
    
}
