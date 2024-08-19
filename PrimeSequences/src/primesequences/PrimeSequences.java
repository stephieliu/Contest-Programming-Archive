/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primesequences;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PrimeSequences {

    public static boolean isPrime(int b){
        for(int i = 2; i <= (int)Math.sqrt(b); i++)
            if(b % i == 0)
                return false;
        return b != 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int x = 0;
        for(int i =1; i<n; i++){
            int [] subsequence = null;
            for(int j = 0; j<subsequence.length-i;j++){
                sum = subsequence[j]+subsequence[j+1];
                if(isPrime(sum)){
                    System.out.println("Shortest primed subsequence is length "
                    +i+": "+subsequence[j]+" "+subsequence[j+1]);
                }
                else{
                    System.out.println("This sequence is anti-primed.");
                }
            }
        }
    }
    
}
