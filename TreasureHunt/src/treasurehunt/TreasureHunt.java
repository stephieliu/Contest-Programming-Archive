/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasurehunt;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TreasureHunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String [][] castle = new String [N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                castle[i][j] = input.next();                
            }
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if("K".equals(castle[i][j])){
                    int treasure=0;
                    treasure++;
                    System.out.println(treasure);
                }
            }            
        }
    }    
}
