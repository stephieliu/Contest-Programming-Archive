/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimethylbenzene;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class Dimethylbenzene {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, m; static boolean adj[][], vis[][], cycle = false;
    public static void main(String[] args) throws IOException {
        n = readInt(); m = readInt(); adj = new boolean[n+1][n+1]; vis = new boolean[n+1][n+1];
        for(int i = 1; i<=m; i++){
            int u = readInt(), v = readInt();
            adj[u][v] = adj[v][u] = true;
        }
        for(int i = 1; i<=n; i++){
            if(!vis[i][i]) dfs(i,i,1);
            if(cycle){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    static void dfs(int cur, int start, int len){
        vis[start][cur] = true;
        for(int nxt = 1; nxt<=n; nxt ++){
            if(!adj[cur][nxt]) continue;
            if(nxt == start && len == 6){
                cycle = true; return;
            }
            if(!vis[start][nxt]) dfs(nxt, start, len+1);
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
