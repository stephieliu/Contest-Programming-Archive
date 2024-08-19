/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextprime;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class NextPrime {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(int n){
        for(int i=2; i<=(int)(Math.sqrt(n)); i++){
           if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N==1){
            System.out.println(2);
        }
        else if(isPrime(N)){
            System.out.println(N);
        }
        else{
            while(!isPrime(N)){
                N++;
            }
            System.out.println(N);
        }
    }
    
}
