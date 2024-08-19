/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconnection;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class StringConnection {

    /**
     * @param args the command line arguments
     */
    static int fact(int n){ 
        return (n <= 1) ? 1 : n * fact(n - 1); 
    }
    static int findSmallerInRight(String str, int low, int high){ 
        int countRight = 0, i; 
        for (i = low + 1; i <= high; ++i){ 
            if (str.charAt(i) < str.charAt(low)){
                ++countRight;
            }
        }
        return countRight; 
    }
    static int findRank(String str){ 
        int len = str.length(); 
        int mul = fact(len); 
        int rank = 1; 
        int countRight;
        for (int i = 0; i < len; ++i) { 
            mul /= len - i; 
            countRight = findSmallerInRight(str, i, len - 1); 
            rank += countRight * mul; 
        } 
        return rank; 
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int L = input.nextInt();
        String [] S = new String [N];
        Map<String, Integer> lexico = new TreeMap<>(Collections.reverseOrder());
        int [] ranks = new int [N];
        for(int i = 0; i<N; i++){
            S[i] = input.next();
            ranks[i] = findRank(S[i]);
            lexico.put(S[i], ranks[i]);
        }
        Set <String> keys = lexico.keySet();
        for(String key: keys){
            System.out.print(key);
        }
    }
    
}
