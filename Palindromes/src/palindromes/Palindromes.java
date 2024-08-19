/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] palindromes;
        palindromes = new String[n];
        for(int i = 0; i<n; i++){
            palindromes[i] = input.next();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0, length = palindromes[j].length(); j<palindromes[i].length();
                    j++, length--)
            if(palindromes[i].charAt(j)==palindromes[i].charAt(length)){
                System.out.println(palindromes[i]);
                System.out.println(palindromes[i].length());
            }        
        }
    }
}
