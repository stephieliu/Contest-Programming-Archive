/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savenagato;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SaveNagato {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, last; static List<Integer> adj[];
    public static void main(String[] args) throws IOException {
        n = readInt(); adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList();
        }
        for(int i = 1; i<n; i++){
            int u = readInt(), v = readInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        int dis1[] = new int[n+1], dis2[] = new int[n+1];
        bfs(1, dis1); bfs(last, dis1); bfs(last, dis2);
        for(int i = 1; i<=n; i++) System.out.println(Math.max(dis1[i], dis2[i]));
    }
    static void bfs(int start, int dis[]){
        Queue<Integer> q = new LinkedList();
        boolean vis[] = new boolean[n+1];
        q.add(start); vis[start] = true;
        dis[start] = 1;
        while(!q.isEmpty()){
            int u = q.poll(); last = u;
            for(int v : adj[u]){
                if(!vis[v]){
                    q.add(v);
                    vis[v] = true;
                    dis[v] = dis[u]+1;
                }
            }
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
