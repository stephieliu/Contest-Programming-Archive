/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumgame;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SumGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] Swifts = new int [N];
        int [] Semaphores = new int [N];
        int sum = 0;
        int sum1 = 0;
        int K = 0;
        for(int i = 0; i<N;i++){
            Swifts[i] = input.nextInt();
        }
        for(int i = 0; i<N;i++){
            Semaphores[i] = input.nextInt();
        }
        for(int i = 0; i<N; i++){
            sum = sum+ Swifts[i];
            sum1 = sum1+Semaphores[i];
            if(sum==sum1){
                K = i;
            }
        }
        System.out.println(K);
    }
    
}
