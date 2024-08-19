/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prettyaverageprimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PrettyAveragePrimes {

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
        int T = input.nextInt();
        for(int yo = 0; yo<T; yo++){
            int N = input.nextInt();
            for(int a = 2, b = 2*N-a; a<2*N; a++, b--){
                if(isPrime(a)&&isPrime(b)){
                    System.out.println(a+" "+b);
                    break;
                }
            }
        }
    }
    
}
