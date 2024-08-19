/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substrings;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Substrings {

    /**
     * @param args the command line arguments
     */
    static int count(String s){
        int n = s.length();
        return n * (n+1)/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i<N; i++){
            String S =input.next();
            System.out.println(count(S));
        }
        
    }
    
}
