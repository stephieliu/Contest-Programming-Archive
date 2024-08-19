/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snekplusladders;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SnekPlusLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;

        for(;sum!=100;){
            int roll = input.nextInt();
            if(roll==0){
                System.out.println("You Quit!");
            }
            while(roll!=0){
                sum = sum+roll;
                if(sum==54){
                    sum = 19;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum==90){
                    sum = 48;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum == 99){
                    sum = 77;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum == 9){
                    sum = 34;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum == 40){
                    sum = 64;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum == 67){
                    sum = 86;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else if(sum == 100){
                    System.out.println("You Win!");
                    break;
                }
                else if(sum==0){
                    System.out.println("You Quit!");
                    break;
                }
                else if(sum>=100){
                    sum = sum-roll;
                    System.out.println("You are now on square "+sum);
                    break;
                }
                else{
                    System.out.println("You are now on square "+sum);
                    break;
                }
            }
        }
    }
    
}
