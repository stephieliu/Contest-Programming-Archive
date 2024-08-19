/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleighride;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SleighRide {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt()+1, sum = 0, max = 0; List<Edge> adj[] = new ArrayList[n];
        for(int i = 0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<n; i++){
            int u = readInt(), v = readInt(), w = readInt();
            sum+=w;
            adj[u].add(new Edge(v,w));
            adj[v].add(new Edge(u, w));
        }
        //BFS
        Queue<Integer> q = new LinkedList<>();
        int dis[] = new int[n]; boolean vis[] = new boolean[n];
        q.add(0); dis[0] = 0; vis[0] = true;
        while(!q.isEmpty()){
            int u = q.poll(); max = Math.max(dis[u], max);
            for(Edge e : adj[u]){
                int v = e.v, w = e.w;
                if(!vis[v]){
                    q.add(v); vis[v] = true;
                    dis[v] = dis[u]+w;
                }
            }
        }
        System.out.println(2*sum - max);
    }
    static class Edge{
        int v, w;
        Edge(int v0, int w0){
            v = v0; w = w0;
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
