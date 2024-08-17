/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatseuence;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GreatSeuence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(), K =input.nextInt(), Q = input.nextInt();
        int [] sequence = new int [N];
        int[][] subsequences = new int [Q][4];
        for(int i = 0; i<N; i++){
            sequence[i] = input.nextInt();
        }
        for(int i = 0; i<Q; i++){
            for(int j = 0; j<4; j++){
                subsequences[i][j] = input.nextInt();
            }
        } 
    }
    
}
