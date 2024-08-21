/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trooublingtimesssss;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TrooublingTimesssss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int interval = 0;
        int jumps = 0;
        for(int i = 0; i<N; i++){
            int test = input.nextInt();
            if(D%test==0){
                if(test>interval){
                    interval = test;
                    jumps = Math.abs(D/test);
                }
            }
        }
        if(jumps!=0){
            System.out.println(jumps);
        }
        else{
            System.out.println("This is not the best time for a trip.");
        }
    }
    
}
