/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deforestationsss;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Deforestationsss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//number of trees
        int [] mass = new int [N];
        for(int i = 0; i<N; i++){
            mass[i] = input.nextInt();
        }
        int [] prefixsum = new int [N];
        prefixsum[0] = mass[0];
        for(int i = 1; i<N; i++){
            prefixsum[i] = prefixsum[i-1]+mass[i];
        }
        int Q = input.nextInt();
        for(int i = 0; i<Q; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int sum = prefixsum[b] - prefixsum[a] + mass[a];
            System.out.println(sum);
        }
    }
    
}
