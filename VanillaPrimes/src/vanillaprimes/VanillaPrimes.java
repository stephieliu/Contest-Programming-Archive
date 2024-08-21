/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanillaprimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class VanillaPrimes {

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
        int prime = input.nextInt();
        if(prime==1 || prime<=0){
            System.out.println("not");
        }
        else if(isPrime(prime)){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    
    }
    
}
