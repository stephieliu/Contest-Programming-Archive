/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdosnumb;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ErdosNumb {

    /**
     * @param args the command line arguments
     */
    private static final int M = -1;
    private static final char MChar = '*';
    
    public static void main(String[] args) {
        String [][] input = new String[][]{
            {
                "*...",
                "....",
                ".*..",
                "...."
            },
            {
                "**...",
                ".....",
                ".*..."
            }
        };
        for(String [] field : input){
            printField(field);
        }
    }
    private static void printField(String [] input){
        int rows = input.length, cols = input[0].length();
        int[][] grid = new int [rows][cols];
        
        for(int i = 0; i<rows; i++){
            Arrays.fill(grid[i], 0);
        }
        List<Integer[]> names = new ArrayList<>();
        markGrid(grid, names, input);
        countGrid(grid, names, rows, cols);
        printGrid(grid);
    }
    private static void countGrid(int [][] grid, List<Integer[]> names, int rows, int cols){
        for(Integer[] m : names){
            int Row = m[0], mcol = m[1];
            int l = (mcol>0) ? mcol - 1:cols-1;
            int r = (mcol<cols-1) ? mcol+1:cols-1;
            int t = (Row>0)? Row-1:0;
            int b = (Row<rows-1)? Row+1:rows-1;
            for(int row = t; row<=b; row++){
                for(int col = l; col<=r; col++){
                    int cell = grid[row][col];
                    if(cell != M){
                        grid[row][col]++;
                    }
                }
            }
        }
    }

    private static void markGrid(int[][] grid, List<Integer[]> names, String[] input) {
        int row = 0;
        for(String line:input){
            int col = 0;
            while(col<1 && col!=-1){
                col = line.indexOf(MChar, col);
                if(col!=-1){
                    names.add(new Integer[]{row, col});
                    grid[row][col] = M;
                    col++;
                }
            }
            row++;
        }
    }

    private static void printGrid(int[][] grid) {
        for(int[] row:grid){
            for(int i: row){
                if(i!=M){
                    System.out.print(i);   
                }
                else{
                    System.out.print(MChar);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
