/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosswordpuzzle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CrosswordPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] grid = new String [10][10];
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                grid[i][j] = input.next();
            }
        }
        String [] characters = new String[10];
        for(int i = 0; i<10; i++){
            characters[i] = input.next();
            if(";".equals(characters[i])){
                i++;
            }
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if("-".equals(grid[i][j])){
                    grid[i][j]=characters[i];
                }
            }
        }
        System.out.println(grid);
    }
    
}
