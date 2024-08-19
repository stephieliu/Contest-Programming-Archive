/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //part a)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int test = input.nextInt();
        int factorCheck = 2;
        boolean isPrime = true;
        while (factorCheck < test){
            if(test % factorCheck == 0){
                isPrime = false;
            }
            factorCheck++;
        }
        if (isPrime&&test!=1){
            System.out.println("Is prime.");
        }
        else{
            System.out.print("Not prime.");
        }
        //part b)
        System.out.print("Enter two integers: ");
        int lower = input.nextInt();
        int upper = input.nextInt();
        while(lower <= upper){
            if(upper <= 1){
                System.out.print("There are no prime numbers.");
                break;
            }
            else{
                int factorCheck1 = 2;
                boolean isPrime1 = true;
                while (factorCheck1 < lower){
                    if(lower % factorCheck1 == 0){
                        isPrime1 = false;
                    }
                    factorCheck1++;
                }
                if (isPrime1&&lower!=1){
                    System.out.println(lower);
                }
                else{
                    System.out.print("");
                }
                lower++;
            }
        }
    }
    
}
