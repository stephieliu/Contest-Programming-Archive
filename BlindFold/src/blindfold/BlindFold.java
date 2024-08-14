/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blindfold;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BlindFold {

    /**
     * @param args the command line arguments
     */
    static int dir[][] = { {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
    static int R, C; static char g[][];  static String cmd[];
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        R = in.nextInt(); C = in.nextInt(); g = new char[R][C];
        for(int i=0; i<R; i++) g[i] = in.next().toCharArray();
        int M = in.nextInt(); cmd = new String [M];
        for(int i=0; i<M; i++) cmd[i] = in.next();
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(g[i][j] == 'X') continue;
                for(int k=0; k<4; k++) go(i, j, k);
            }
        }
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++)
                System.out.print(g[i][j]);
            System.out.println();
        }
    }
    static void go(int r, int c, int d){
        for(int i=0; i<cmd.length; i++){
            if(cmd[i].equals("F")) { r += dir[d][0]; c += dir[d][1]; }
            else if(cmd[i].equals("R")) d = (d+1)%4; 
            else d = (d-1+4)%4;
            if(r<0 || r>=R || c<0 || c>=C || g[r][c]=='X') return;
        }
        g[r][c] = '*';
    }
}
