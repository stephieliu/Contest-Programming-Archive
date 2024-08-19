/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SnakesandLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OUTER:
        for (int board = 1; board<=100;) {
            int roll = input.nextInt();
            board = board+roll;
            if(100-board>=0){
                switch (board) {
                    case 9:
                        board = 34;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 40:
                        board = 64;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 54:
                        board = 19;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 67:
                        board = 86;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 90:
                        board = 48;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 99:
                        board = 77;
                        System.out.println("You are now on square "+ board);
                        break;
                    case 100:
                        System.out.println("You are now on square "+ board);
                        System.out.println("You WIN!");
                        break OUTER;
                    default:
                        System.out.println("You are now on square "+ board);
                        break;
                }
            }
            else{
                board = board-roll;
                System.out.println("You are now on square "+ board);
            }
        }
    }
    
}
