/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironscaling;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class IronScaling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        for(int i = 0; i<k; i++){
            for(int j = 0; j<k; j++){
                System.out.print("*");
            }
            for(int j = 0; j<k; j++){
                System.out.print("x");
            }
            for(int j = 0; j<k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<k; i++){
            for(int j = 0; j<k; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<k*2; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        for(int i = 0; i<k; i++){
            for(int j = 0; j<k; j++){
                System.out.print("*");
            }
            for(int j = 0; j<k; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
