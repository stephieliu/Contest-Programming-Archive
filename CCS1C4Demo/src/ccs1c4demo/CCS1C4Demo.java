/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccs1c4demo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CCS1C4Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str  = input.next();
        int [] charCount = new int [255];
        for(int i = 0; i<str.length(); i++){
            charCount[str.charAt(i)]++;
        }
        for(int i = 0; i<str.length(); i++){
            
        }
    }
    
}
