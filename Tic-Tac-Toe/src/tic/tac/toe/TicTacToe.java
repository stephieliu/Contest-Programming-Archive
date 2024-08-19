/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int y = 0; y<t; y++){
            String []Grid = new String [3];
            for(int i = 0;i<3;i++){
                Grid[i]= input.next();
                if(Grid[i]== "X" || Grid[i]=="x"){
                    int x = 0;
                    x++;
                }
                else if(Grid[i]=="O" || Grid[i]=="o"){
                    int o = 0;
                    o++;
                }
                else{
                    int empty = 0;
                    empty++;
                }
            }
        }
        
    }
    
}
