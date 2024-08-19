/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquares;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MagicSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int [][] MagicSquare = new int[4][4];
        boolean isMagic = true;
        int sum = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0; j<4;j++){
                MagicSquare[i][j] = input.nextInt();
            }
        }
        int [] rowSums = new int[4];
        int [] colSums = new int[4];
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += MagicSquare[i][j];
                colSum += MagicSquare[j][i];
            }
            rowSums[i] = rowSum;
            colSums[i] = colSum;
        }
        sum = rowSums[0];
        if(sum != colSums[0]){
            isMagic = false;
        }
        if(isMagic){
            for(int i = 0; i < 4; i++){
                if(rowSums[i]!= sum || colSums[i] != sum){
                    isMagic = false;
                    break;
                }
            }
        }
        if(isMagic){
            System.out.println("magic");
        }
        else{
            System.out.println("not magic");
        }  
    }
    
}
