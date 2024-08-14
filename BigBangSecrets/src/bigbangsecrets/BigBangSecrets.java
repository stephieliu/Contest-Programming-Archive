/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbangsecrets;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BigBangSecrets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        String temp = input.nextLine();
        String word = input.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char [] shift = new char [word.length()];
        for(int i = 0; i<word.length();i++){
            int S = 3*(i+1)+K;
            int index = alphabet.indexOf(word.charAt(i));
            if(index-S>=0){
                shift[i] = alphabet.charAt(index-S);
            }
            else{
                index = 26-Math.abs(index-S);
                shift[i] = alphabet.charAt(index);
            }
            System.out.print(shift[i]);
        }        
    }
    
}
