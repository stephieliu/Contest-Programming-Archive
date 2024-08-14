/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adam.sparty;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AdamSParty {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int bfs(List<Integer> g[], boolean[] mark, int u, List<Integer> dis){
        int lastMarked;
        Queue<Integer> q = new ArrayList<>();
        
    }
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt(), K = readInt();
        int adj[][] = new int[N+1][N+1];
        for(int i = 0; i<M; i++){
            adj[readInt()][readInt()] = 1;
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
