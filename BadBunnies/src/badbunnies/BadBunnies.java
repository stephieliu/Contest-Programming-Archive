/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badbunnies;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class BadBunnies {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n= readInt(), rabbit = readInt(); List<Integer> adj[] = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList();
        }
        for(int i = 1; i<n; i++){
            int u = readInt(), v = readInt();
            adj[u].add(v); adj[v].add(u);
        }
        Queue<Integer> q = new LinkedList();
        boolean vis[] = new boolean[n+1]; int dis[] = new int[n+1];
        for(int i = 1; i<=rabbit; i++){
            int x = readInt(); q.add(x); vis[x] = true; dis[x] = 0;
        }
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : adj[u]){
                if(!vis[v]){
                    q.add(v);
                    vis[v] = true; dis[v] = dis[u]+1;
                }
            }
        }
        int start = readInt(), end = readInt(), prev[] = new int[n+1];
        Arrays.fill(vis, false); q.add(start); vis[start] = true; prev[start] = -1;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : adj[u]){
                if(!vis[v]){
                    q.add(v);
                    vis[v] = true;
                    prev[v] = u;
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int u = end; u!= -1; u = prev[u]){
            ans = Math.min(ans, dis[u]);
        }
        System.out.println(ans);
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
