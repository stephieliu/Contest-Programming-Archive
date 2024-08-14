/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computingtournament;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ComputingTournament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int [][] points = new int [N][2];
        int [] round1 = new int [N];
        int [] round2 = new int [K];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                points[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i<N; i++){
            round1[i] = points[i][0];
        }
        Arrays.sort(round1);
        for(int i = N; i>K; i--){
            if(points[i][0]==round1[i]){
                
            }
        }
    }
    
}
