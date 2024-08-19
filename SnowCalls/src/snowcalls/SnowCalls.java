/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snowcalls;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SnowCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0; i<number;i++){
            String realnumber = input.next();
            realnumber = realnumber.replaceAll("-","");
            realnumber = realnumber.replaceAll("A","2");
            realnumber = realnumber.replaceAll("B","2");
            realnumber = realnumber.replaceAll("C","2");
            realnumber = realnumber.replaceAll("D","3");
            realnumber = realnumber.replaceAll("E","3");
            realnumber = realnumber.replaceAll("F","3");
            realnumber = realnumber.replaceAll("G","4");
            realnumber = realnumber.replaceAll("H","4");
            realnumber = realnumber.replaceAll("I","4");
            realnumber = realnumber.replaceAll("J","5");
            realnumber = realnumber.replaceAll("K","5");
            realnumber = realnumber.replaceAll("L","5");
            realnumber = realnumber.replaceAll("M","6");
            realnumber = realnumber.replaceAll("N","6");
            realnumber = realnumber.replaceAll("O","6");
            realnumber = realnumber.replaceAll("P","7");
            realnumber = realnumber.replaceAll("Q","7");
            realnumber = realnumber.replaceAll("R","7");
            realnumber = realnumber.replaceAll("S","7");
            realnumber = realnumber.replaceAll("T","8");
            realnumber = realnumber.replaceAll("U","8");
            realnumber = realnumber.replaceAll("V","8");
            realnumber = realnumber.replaceAll("W","9");
            realnumber = realnumber.replaceAll("X","9");
            realnumber = realnumber.replaceAll("Y","9");
            realnumber = realnumber.replaceAll("Z","9");
            realnumber = realnumber.substring(0,3) + "-"+realnumber.substring(3,6)
                    +"-"+realnumber.substring(6,10);
            System.out.println(realnumber);
        }
    }
    
}
