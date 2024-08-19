/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min;
        int max;
        int i;
        for(min = 1, max = 10, i = 1;;i++){
            System.out.print("Enter a random number between 1 and 10: ");
            int in = input.nextInt();
            int random = (int) (Math.floor(Math.random()*(max-min+1))+min);
            if(in==random){
                System.out.println("You guessed the right number in "+i+
                        " tries!");
                break;
            }
            if(in>random){
                System.out.println("Your guess was too high. Please try again.");
            }
            if(in<random){
                System.out.println("Your guess was too low. Please try again.");
            }
        }
    }
    
}
