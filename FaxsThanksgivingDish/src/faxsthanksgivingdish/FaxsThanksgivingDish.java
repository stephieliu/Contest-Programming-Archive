/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faxsthanksgivingdish;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class FaxsThanksgivingDish {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, m, cnt[]; static List<Integer> adj[]; static boolean vis[];
    
    public static void main(String[] args) throws IOException {
        n = readInt(); m = readInt();
        adj = new ArrayList[n+1];
        cnt = new int[n+1];
        vis = new boolean[n+1];
        for(int i = 1; i<=n; i++) adj[i] = new ArrayList();
        for(int i = 1; i<=m; i++){
            int target = readInt(), k = readInt();
            for(int j = 1; j<=k; j++){
                int x = readInt();
                adj[target].add(x);
            }
        }
        for(int i = 1; i<=n; i++) cnt[i] = readInt();
        System.out.println(dfs(1));
    }
    static int dfs(int u){
        vis[u] = true;
        int min = Integer.MAX_VALUE;
        for(int v : adj[u]){
            if(!vis[v]) min = Math.min(min, dfs(v));
            else min = 0;
        }
        if(min!=Integer.MAX_VALUE) return min + cnt[u];
        return cnt[u];
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
