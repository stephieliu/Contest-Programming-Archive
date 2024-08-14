/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12hmk.q1;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Class12HmkQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        convert();
    }
    public static void convert(){
        System.out.print("Enter the amount of kilograms: ");
        Scanner input = new Scanner(System.in);
        int kg = input.nextInt();
        double lbs = kg/0.45359237;
        System.out.print("The number of pounds is: "+lbs+" lbs.");
    }
    
}
