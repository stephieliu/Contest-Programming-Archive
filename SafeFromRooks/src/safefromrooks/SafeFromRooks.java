/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safefromrooks;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SafeFromRooks {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int qq = 0; qq<5; qq++){
            int r = readInt(), c = readInt(), ro = readInt();
            int[][] board = new int[r][c];
            for(int i = 0; i<ro; i++){
                int x = readInt(), y = readInt();
                fillDown(board, y-1);
                fillAcross(board, x-1);
            }
            count(board);
        }
    }
    static void count(int [][]arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]==0) count++;
            }
        }
        System.out.println(count);
    }
    static void fillDown(int[][] grid, int i) {
        for (int j = 0; j < grid[i].length; j++) {
            grid[i][j] = -1;
        }
    }
    static void fillAcross(int[][] grid, int i){
        for (int j = 0; j < grid.length; j++) {
            grid[j][i] = -1;
        }
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
