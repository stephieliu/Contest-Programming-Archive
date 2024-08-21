/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troublingtimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TroublingTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int J = 0;
        int diff = 0, sum = 0;
        int [] length = new int [N];
        for(int i = 0; i<N; i++){
            length[i] = input.nextInt();
        }
        for(int i = 0; i<N; i++){
            if(N<=D){
                for(int y = 0; y<N; y++){
                    diff = N-length[i];
                    while(diff==D){
                        J++;
                    }
                    if(J>0){
                        System.out.println(J);
                    }
                    else{
                        System.out.println("This is not the best time for a trip.");
                    }
                }
            }
            else{
                for(int y = 0; y<N; y++){
                    sum = N+length[i];
                    while(sum==D){
                        J++;
                    }
                    if(J>0){
                        System.out.println(J);
                    }
                    else{
                        System.out.println("This is not the best time for a trip.");
                    }
                }
            }
        }  
    }
}