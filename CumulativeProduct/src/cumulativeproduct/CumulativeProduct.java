/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cumulativeproduct;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CumulativeProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int numbers = input.nextInt();
        int product = 1;
        for(int i = 0; i<numbers; i++){
            System.out.print("Next number --> ");
            int x = input.nextInt();
            product *= x; 
        }
        System.out.println("Product = "+product);
    }
    
}
