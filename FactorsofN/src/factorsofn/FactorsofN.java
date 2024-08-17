/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorsofn;

/**
 *
 * @author Stephie
 */
//input a number PositiveInteger; write down all factors of that number
import java.util.Scanner;
public class FactorsofN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int PositiveInteger = input.nextInt();
        int factorCheck;
        
        for(factorCheck = 1;factorCheck<=PositiveInteger;factorCheck++){
            if (PositiveInteger%factorCheck==0){
                System.out.print(factorCheck + " ");
            }
        }
        
    }
    
}
