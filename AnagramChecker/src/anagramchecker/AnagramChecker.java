/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramchecker;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AnagramChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        
        int[]c = new int[128];
        int[]d = new int[128];
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) != ' '){
            c[a.charAt(i)]++;
        }       
        }
        for(int j = 0; j<b.length();j++){
            if(b.charAt(j) != ' '){
            d[b.charAt(j)]++;
        }       
        }
        if(Arrays.equals(c,d)){
            System.out.println("Is an anagram.");
        }
        else{
            System.out.println("Is not an anagram.");
        }
    }
    
}
