/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boostercushions;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BoosterCushions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(), N = input.nextInt(), K = input.nextInt();
        int columns = K/M;
        int [] audience = new int [K];
        int [][] seats = new int [M][N];
        int [] cushions = new int [K];
        
        for(int i = 0; i<K; i++){
            audience[i] = input.nextInt();
        }
        Arrays.sort(audience);
        for(int j = 0; j<M; j++){
            for(int i = 0; i<columns; i++){
                seats[j][i] = audience[K-1-i];
            }
        }
        for(int i = 0; i<K; i++){
            
        }
    }
    
}
