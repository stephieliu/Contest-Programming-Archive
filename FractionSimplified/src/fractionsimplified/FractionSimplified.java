/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionsimplified;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class FractionSimplified {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int n1 = input.nextInt();
        System.out.print("Enter the denominator: ");
        int n2 = input.nextInt();
        int temp1 = n1;
        int temp2 = n2; 

        while (n1 != n2){
         if(n1 > n2)
            n1 = n1 - n2;
         else
            n2 = n2 - n1;
        }      

        int n3 = temp1 / n1 ;
        int n4 = temp2 / n1 ;

        System.out.print("The simplified fraction is: " 
                + n3 + "/" + n4 + "\n\n" );
        System.exit(0);
    }
   
}
