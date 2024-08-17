/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gold;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Gold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt(), Y = input.nextInt(), Z = input.nextInt(), 
                N = input.nextInt();
        int [] buyout = new int [N];
        for(int i = 0; i<N; i++){
            buyout[i] = input.nextInt();
        }
        Arrays.sort(buyout);
        int count = 0;
        for(int i = 0; i<N; i++){
            if(Z>=buyout[i]&&Z>0){
                int diff = Z-buyout[i];
                if(diff>=0){
                    Z -=buyout[i];
                    count++;
                }
            }
            else{
                break;
            }
        }
        int max = (Z+((int)Math.floor(X/(N-count)))*Y);
        System.out.println(max);
    }
    
}
