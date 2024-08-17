/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantants;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class GiantAnts {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt();
        List<Integer> adj[] = new ArrayList[n+1];
        for(int i = 1; i<=n; i++) adj[i] = new ArrayList();
        for(int i = 1; i<=m; i++){
            int u = readInt(), v = readInt(); adj[u].add(v);
            adj[v].add(u);
        }
        int w = readInt(), ants[] = new int[n+1];
        Queue<Integer> q = new LinkedList(); boolean vis[] = new boolean[n+1];
        for(int i = 1; i<=w; i++){
            int x = readInt();
            q.add(x);
            vis[x] = true;
        }
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nxt : adj[curr]){
                if(!vis[nxt]){
                    q.add(nxt);
                    vis[nxt] = true;
                    ants[nxt] = ants[curr]+4;
                }
            }
        }
        Arrays.fill(vis, false);
        q.add(1);
        int dis[] = new int[n+1]; dis[1] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nxt: adj[curr]){
                if(!vis[nxt] && dis[curr]+1<ants[nxt]){
                    q.add(nxt);
                    vis[nxt] = true;
                    dis[nxt] = dis[curr]+1;
                }
            }
        }
        if(vis[n]) System.out.println(dis[n]);
        else System.out.println("sacrifice bobhob314");
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
