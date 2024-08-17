/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstextentry;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GPSTextEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String location = input.nextLine();
        char [][] keypad = new char[5][6];
        keypad[0] = "ABCDEF".toCharArray();
        keypad[1] = "GHIJKL".toCharArray();
        keypad[2] = "MNOPQR".toCharArray();
        keypad[3] = "STUVWX".toCharArray();
        keypad[4] = "YZ -.%".toCharArray();
        int next1 = 0, pre1 = 0, next2 = 0, pre2 = 0, moves = 0; 
        for (int i = 0; i<location.length(); i++) {
            int C = location.charAt(i);
            for (int j = 0; j<5; j++) {
                for (int y = 0; y<6; y++) {
                    if (keypad[j][y] == C) {
                        next1 = j;
                        next2 = y;
                    }
                }
            }
            moves += Math.abs(next1-pre1) + Math.abs(next2-pre2);
            pre2 = next2;
            pre1 = next1;
        }
        moves += Math.abs(4-pre1) + Math.abs(5-pre2);
        System.out.println(moves);
    }
    
}
