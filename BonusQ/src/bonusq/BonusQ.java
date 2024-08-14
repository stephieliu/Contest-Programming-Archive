/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusq;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class BonusQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = "";
        int w1 = 0;
        System.out.print("Enter a 3-digit whole number: ");
        w = sc.next();
        if(w.length() > 3){
            System.out.println("ERROR: IndexOutOfBounds Exception "
                + "\nPlease enter a valid output.");
        }
        else{
            w1 = Integer.parseInt(Character.toString(w.charAt(0)));
            w1 += Integer.parseInt(Character.toString(w.charAt(1)));
            w1 += Integer.parseInt(Character.toString(w.charAt(2)));
            System.out.println("The sum of the digits is "+ w1 + ".");
        } 
    }
    
}
