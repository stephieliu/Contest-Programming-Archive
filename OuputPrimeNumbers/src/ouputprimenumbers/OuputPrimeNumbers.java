/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ouputprimenumbers;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class OuputPrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int div = input.nextInt();
        int i = 1;
        while(i <= div){
            if(div <= 1){
                System.out.print("There are no prime numbers.");
                break;
            }
            else{
                int factorCheck = 2;
                boolean isPrime = true;
                while (factorCheck < i){
                    if(i % factorCheck == 0){
                        isPrime = false;
                    }
                    factorCheck++;
                }
                if (isPrime&&i!=1){
                    System.out.println(i);
                }
                else{
                    System.out.print("");
                }
                i++;
            }
        }
    }
}