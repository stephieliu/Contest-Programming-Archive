/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smilewithsimiles;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SmileWithSimiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String [] adjectives = new String [n];
        String [] nouns = new String [m];
        for(int i = 0; i<n; i++){
            adjectives[i] = input.next();
        }
        for(int i = 0; i<m; i++){
            nouns[i] = input.next();
        }
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.println(adjectives[i]+" as "+nouns[j]);
            }
            
        }
    }
    
}
