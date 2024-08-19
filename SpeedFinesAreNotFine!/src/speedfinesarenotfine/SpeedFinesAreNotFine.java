/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedfinesarenotfine;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SpeedFinesAreNotFine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int record = input.nextInt();
        int diff = record-limit;
        if(1<=diff&& diff<=20){
            System.out.println("You are speeding and your fine is $100.");
        }
        else if(limit>=record){
            System.out.println("Congratulations, you are within the "
                    + "speed limit!");
        }
        else if(21<=diff&&diff<=30){
            System.out.println("You are speeding and your fine is $270.");
        }
        else{
            System.out.println("You are speeding and your fine is $500.");
        }
    }
    
}
