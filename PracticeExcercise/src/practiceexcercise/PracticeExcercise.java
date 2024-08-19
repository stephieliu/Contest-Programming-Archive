/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexcercise;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class PracticeExcercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write a program that asks the user for a number n and output the sum of the first n natural numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("How many natural numbers? ");
        int n = input.nextInt();
        
        int s = 1;
        int sum=0;
        while (s <= n){
           sum =sum + s;
           s ++;

        }
        System.out.print("The sum is " + sum);
        
    }
    
}
