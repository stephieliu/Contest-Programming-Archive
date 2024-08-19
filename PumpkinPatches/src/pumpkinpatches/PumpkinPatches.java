/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pumpkinpatches;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PumpkinPatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int [][] coordinates = new int [P][2];
        for(int i = 0; i<P; i++){
            for(int j = 0; j<2; j++){
                coordinates[i][j] = input.nextInt();
            }
        }
        int lowestY = Integer.MAX_VALUE;
        int lowerX = Integer.MAX_VALUE;
        int upperLeft = 0;
        int lowerRight = 0;
        for(int i = 0; i<P; i++){
            if(coordinates[i][1]<lowestY){
                lowestY = coordinates[i][1];
            }
            if(coordinates[i][0]<lowerX){
                lowerX = coordinates[i][0];
            }
        }
        int LowerLeft = Integer.MIN_VALUE;
        int lowLeft = Integer.MIN_VALUE;
        for(int i= 0; i<P; i++){
            if(coordinates[i][0]==lowerX && coordinates[i][1]>LowerLeft){
                upperLeft = coordinates[i][1];
                LowerLeft = coordinates[i][1];
            }
            if(coordinates[i][1]==lowestY && coordinates[i][0]>lowLeft){
                lowerRight = coordinates[i][0];
                lowLeft = coordinates[i][0];
            }
        }
        int length = upperLeft-lowestY;
        int width = lowerRight - lowerX;
        int Peri = 2*(length+width);
        System.out.println(Peri);
    }
    
}
