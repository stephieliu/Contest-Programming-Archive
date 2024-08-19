/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topyodeller;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TopYodeller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//number of total yodellers
        int k = input.nextInt();//number of rounds in competition
        int [][] scores = new int [n][k];
        for(int i =0; i<k; i++){
            for(int j = 0; j<n; j++){
                scores[j][i] = 0;
            }
        }
        for(int i = 0; i<k; i++){
            //each yodel round
            for(int j = 0; j<n; j++){
                scores[j][i] = scores[j][i]+input.nextInt();
            }
        }
        System.out.println(scores);
    }
    
}
