/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notenoughtester;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class NotEnoughTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        int [] factorList = new int [1000];
        for(int i = 1; i<=1000; i++){
            for(int j = i; j<=1000; j+=i){
                factorList[j-1]++;
            }
        }
        for(int i = 0; i<T; i++){
            int K = input.nextInt(), A = input.nextInt(), count = 0, B = input.nextInt();
            for(int j = A-1; j<B; j++){
                if(factorList[j]==K){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
