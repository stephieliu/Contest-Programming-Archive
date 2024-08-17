/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipper;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Flipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String flip = input.nextLine();
        int [][] original = {{1,2},{3,4}};
        for(int i = 0; i<flip.length(); i++){
            if(flip.charAt(i)=='V'){
                int temp  = 0;
                temp = original[0][0];
                original[0][0] = original[0][1];
                original[0][1] = temp;
                int t = 0;
                t = original[1][0];
                original[1][0] = original[1][1];
                original[1][1] = t;
            }
            else if(flip.charAt(i)=='H'){
                int temp  = 0;
                temp = original[0][0];
                original[0][0] = original[1][0];
                original[1][0] = temp;
                int t = 0;
                t = original[0][1];
                original[0][1] = original[1][1];
                original[1][1] = t;
            }
        }
        System.out.println(original[0][0]+" "+original[0][1]+"\n"+original[1][0]+" "+original[1][1]);
    }
    
}
