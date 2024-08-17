/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directedacyclicgraph;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class DirectedAcyclicGraph {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, vis[]; static boolean adj[][], cycle = false;
    public static void main(String[] args) throws IOException {
        n = readInt(); adj = new boolean[n][n]; vis = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                adj[i][j] = (readInt()==1? true:false);
            }
        }
        for(int i = 0; i<n; i++){
            if(vis[i] == 0) dfs(i);
        }
        System.out.println(cycle? "NO":"YES");
    }
    static void dfs (int u){
        vis[u] = 1;
        for(int v = 0; v<n; v++){
            if(adj[u][v]){
                if(vis[v] == 1){
                    cycle = true;
                    return;
                }
                else if(vis[v] == 0) dfs(v);
            }
        }
        vis[u] = 2;
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
