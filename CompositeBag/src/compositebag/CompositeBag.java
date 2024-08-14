/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositebag;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CompositeBag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int n = 0;
        int counter = 0;
        for(int i = 0; i<N; i++){
            n = input.nextInt();
            if(!isPrime(n))
                counter++;
        }
        System.out.println(counter);
    }
    public static boolean isPrime(int b){
        for(int i = 2; i <= (int)Math.sqrt(b); i++)
            if(b % i == 0)
                return false;
        return b != 1;
    }
}
