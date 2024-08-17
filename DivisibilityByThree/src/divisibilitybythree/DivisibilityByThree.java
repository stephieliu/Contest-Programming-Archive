/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisibilitybythree;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class DivisibilityByThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int p = 0;
        while(n > p){
            p += 3;
            
            if (p%3 == 0 && p%2 != 0){
                System.out.print(p + " ");
            }
            else {   
            }
        } 
    }
}
