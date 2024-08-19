/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.puzzle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class NPuzzle {

    /**
     * @param args the command line arguments
     */
    public static int distance(int x, int y, int i, int j){
        return Math.abs(x-i)+Math.abs(y-j);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [][] puzzle = new char [4][4];
        int Scatter = 0;
        for(int i = 0; i<4; i++){
            String line = input.nextLine();
            for(int j = 0; j<4; j++){
                puzzle [i][j] = line.charAt(j);
                if(puzzle[i][j]!='.'){
                    switch (puzzle[i][j]) {
                        case 'A':
                            Scatter = Scatter+distance(0,0,i,j);
                            break;
                        case 'B':
                            Scatter = Scatter+distance(0,1,i,j);
                            break;
                        case 'C':
                            Scatter = Scatter+distance(0,2,i,j);
                            break;
                        case 'D':
                            Scatter = Scatter+distance(0,3,i,j);
                            break;
                        case 'E':
                            Scatter = Scatter+distance(1,0,i,j);
                            break;
                        case 'F':
                            Scatter = Scatter+distance(1,1,i,j);
                            break;
                        case 'G':
                            Scatter = Scatter+distance(1,2,i,j);
                            break;
                        case 'H':
                            Scatter = Scatter+distance(1,3,i,j);
                            break;
                        case 'I':
                            Scatter = Scatter+distance(2,0,i,j);
                            break;
                        case 'J':
                            Scatter = Scatter+distance(2,1,i,j);
                            break;
                        case 'K':
                            Scatter = Scatter+distance(2,2,i,j);
                            break;
                        case 'L':
                            Scatter = Scatter+distance(2,3,i,j);
                            break;
                        case 'M':
                            Scatter = Scatter+distance(3,0,i,j);
                            break;
                        case 'N':
                            Scatter = Scatter+distance(3,1,i,j);
                            break;
                        case 'O':
                            Scatter = Scatter+distance(3,2,i,j);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        System.out.println(Scatter);
    }
}