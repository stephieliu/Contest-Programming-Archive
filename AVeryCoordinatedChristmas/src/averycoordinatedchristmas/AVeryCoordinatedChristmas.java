/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averycoordinatedchristmas;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AVeryCoordinatedChristmas {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt();
        char[][] grid = new char[N][M];
        int[][] adj = new int[N][M];
        int xx = 0, xy = 0, px = 0, py = 0, ox = 0, oy = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                grid[i][j] = readCharacter();
                if(grid[i][j] == '*'){
                    adj[i][j] = 1;
                }
                else if(grid[i][j] == 'P'){
                    
                }
            }
        }
        System.out.println(bfs(adj));
    }
    static int bfs(int[][] adj){
        return -1;
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
