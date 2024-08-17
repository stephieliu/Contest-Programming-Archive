/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deforestation;

/**
 *
 * @author Stephie
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Deforestation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] mass = new int [N];
        for(int i = 0; i<N; i++){
            mass[i] = input.nextInt();
        }
        int Q = input.nextInt();
//        int [][] boundaries = new int [Q][2];
        for(int i = 0; i<Q; i++){
            int low = input.nextInt();
            int high = input.nextInt();
            
//                boundaries[i][j] = input.nextInt();
        }
        int [] sum = new int [Q];
        for(int i = 0; i<Q; i++){
            for(int j = 0; j<N; j++){
                
//                if(j>=boundaries[i][0] && j<=boundaries[i][1]){
//                    sum[i]+=mass[j];
//                }
            }
        }
        for(int i = 0; i<Q; i++){
            System.out.println(sum[i]);
        }
    } 
}
