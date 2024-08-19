/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thefoolproofprogram;

/**
 *
 * @author steph
 */
import java.util.*;
public class TheFoolProofProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.floor(Math.random()*100)+1);
        int guess, option;
        String gStr, input;
        double check;
        while(true){
            System.out.println("********************************************");
            System.out.println("WELCOME TO THE RANDOM NUMBER GUESSING GAME!");
            System.out.println("********************************************\n\n\n\n");
            System.out.println("1 - Start Guessing");
            System.out.println("2 - Quit Game");
            while(true){
                input = sc.nextLine();
                try{
                    option = Integer.parseInt(input);
                    break;
                }
                catch(Exception e){
                    System.out.println("Please enter 1 or 2.");
                }
            }
            if(option == 1){
                while(true){
                    System.out.println("Please enter an integer.");
                    while(true){
                        gStr = sc.nextLine();
                        try{
                            //guess = Integer.parseInt(gStr);
                            check = Double.parseDouble(gStr);
                            guess = (int) Math.floor(check);
                            break;
                        }
                        catch(Exception e){
                            System.out.println("Please enter a number.");
                        }
                    }
                    if(guess > random) System.out.println("Lower!");
                    else if(guess < random) System.out.println("Higher!");
                    else{
                        System.out.println("Congrats! You win.\n");
                        break;
                    }
                }
            }
            else if(option == 2) break;
            else
                System.out.println();
        }
        sc.close();
    }
    
}
