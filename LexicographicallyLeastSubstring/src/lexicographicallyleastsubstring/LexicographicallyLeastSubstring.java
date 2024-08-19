/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicographicallyleastsubstring;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class LexicographicallyLeastSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int K = input.nextInt();
        String currStr = str.substring(0, K); 
        String lexMin = currStr; 
   
        for (int i = K; i < str.length(); i++) { 
            currStr = currStr.substring(1, K) + str.charAt(i); 
            if (lexMin.compareTo(currStr) > 0) 
                 lexMin = currStr;             
        } 
  
        System.out.println(lexMin); 
    }
    
}
