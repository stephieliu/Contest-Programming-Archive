/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumsumofincreasingorderelementsfromnarrays;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MaximumSumOfIncreasingOrderElementsFromNArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int x = 0; x<T; x++){
            int n = input.nextInt();
            int m = input.nextInt();
            int [][] Array = new int [n][m];
            for(int i = 0;i<n;i++){
                for(int j = 0; j<m; j++){
                    Array[n][m] = input.nextInt();
                }
            }
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    if(Array[i][j]>Array[i+1][j]){
                        System.out.println("0");
                    }
                    
                }
            }
        }
    }
    
}
