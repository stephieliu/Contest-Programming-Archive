/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topyoddeller;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TopYoddeller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int [] sums = new int [n];
        int [] ranking1 = new int [n];
        int [] ranking2 = new int [n];
        for(int i = 0; i<k; i++){
            for(int j = 0; j<n; j++){
                sums[j] += input.nextInt();
            }
        }
        Arrays.sort(sums);
        
        System.out.println(Arrays.toString(sums));
//        for(int i  =0; i<n; i++){
//            
//        }
        
    }
    
}
