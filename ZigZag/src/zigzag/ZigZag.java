/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zigzag;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ZigZag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] zigzag = new int [N];
        int min = 1;
        int max = N;
        int yes = 0;
        
        for(int i = 0; i<N; i++){
            int random = (int) (Math.floor(Math.random()*(max-min+1))+min);
            zigzag[i] = random;
        }
        for(int i = 0; i<N; i++){
            if(i%2==0){
                if(zigzag[i]<zigzag[i+1]){
                    yes++;
                }
            }
            else{
                if(zigzag[i]>zigzag[i+1]){
                    yes++;
                }
            }
        }
        System.out.println(yes);
    }
    
}
