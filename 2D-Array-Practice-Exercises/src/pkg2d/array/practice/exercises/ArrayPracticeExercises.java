/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.array.practice.exercises;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ArrayPracticeExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] Array = new int [4][4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                Array[i][j] = input.nextInt();
            }
        }
        //Swapping two rows
        for(int j = 0; j<4; j++){
            Array[0][j] = Array[1][j];
            Array[1][j] = Array[0][j];
        }
        //Swapping two columns
        for(int i = 0; i<4; i++){
            Array[i][0] = Array[i][1];
            Array[i][1] = Array[i][0];
            
        }
        //Filling from a 1D data structure
        String [][] array = new String [4][4];
        String insert = input.next();
        
    }
    
}
