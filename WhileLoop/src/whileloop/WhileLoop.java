/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class WhileLoop {
//write a program that asks the user fo a number n and prints out the first n even numbers.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("How many even numbers? ");
        int evenCount = input.nextInt();
        while (i <= evenCount*2){
            System.out.print(i + " ");
            i  = i + 2;
        }
        for(;;){
            System.out.println("SPAM");
        }
        /*
        *These are all the same:
        *i++;
        *i = i + 1;
        *i +=1;
        *And these are all the same:
        *i -=1
        *i = i-1;
        *i--;
        */
    }
    
}
