/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trident;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Trident {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int s = input.nextInt();
        int h = input.nextInt();
        for(int i = 0; i<t; i++){
            for(int k = 0; k<3; k++){
                System.out.print("*");
                for(int j = 0; j<s; j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i<(s*2)+3;i++){
            System.out.print("*");
        }
        for(int i = 0; i<h; i++){
            System.out.println();
            for(int j = 0; j<s+1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
    
}
