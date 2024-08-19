/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandembicycle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TandemBicycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();//type of question
        int N = input.nextInt();//number of citizens
        int [] dmoj = new int[N];
        int [] peg = new int [N];
        int t = 0;
        for(int i = 0; i < N; i++){
            dmoj[i] = input.nextInt();
        }
        for(int i = 0; i < N; i++){
            peg[i] = input.nextInt();
        }
        Arrays.sort(dmoj);
        Arrays.sort(peg);
        if(T == 1){
            for(int i = N - 1; i >= 0; i--){
                t += Math.max(dmoj[i], peg[i]);
            }
            System.out.println(t);
        }
        else if(T == 2){
            for(int j = 0; j < N; j++){
                t += Math.max(dmoj[N-1-j], peg[j]);
            }
            System.out.println(t);
        } 
    }
    
}
