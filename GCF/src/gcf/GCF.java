/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcf;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class GCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int factorCheck;
        int gcd=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        numerator = input.nextInt();
        System.out.print("Enter the denominator: ");
        denominator = input.nextInt();
        if (numerator<=denominator){
            factorCheck = numerator;
        }
        else{
            factorCheck = denominator;
        }
        while (factorCheck >=1){
            if(numerator % factorCheck == 0&& denominator % factorCheck == 0){
                gcd = factorCheck;
                break;
            }
            factorCheck--;
        }
        System.out.println("The simplified fraction is "+ (numerator/gcd) + "/" + (denominator/gcd));
    }
    
}
