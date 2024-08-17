/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directedgraphconnectivity;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DirectedGraphConnectivity {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int m, vertex; static boolean vis[], connected = false;
    static List<Integer>[] adj;
    public static void main(String[] args) throws IOException {
        vertex = readInt();
        m = readInt(); adj = new ArrayList[m]; vis = new boolean[m];
        int start[] = new int[m], end[] = new int[m];
        for(int i = 0; i<m; i++){
            adj[i] = new ArrayList<Integer>();
            start[i] = readInt()-1;
            end[i] = readInt()-1;
        }
        int count = 0;
        for(int j = 0; j<m; j++){
            for(int i = 0; i<m; i++){
                if(i!=count){
                    adj[start[i]].add(end[i]);
                }
            }
            for(int i = 0; i<m; i++){
                if(!vis[i]) dfs(i);
            }
            if(vis[vertex-1]) System.out.println("YES");
            else System.out.println("NO");
            System.out.println(Arrays.toString(adj));
            System.out.println(Arrays.toString(vis));
            count++;
        }
//        for(int i = 0; i<m; i++){
//            adj[readInt()-1].add(readInt()-1);
//        }
//        for(int i = 0; i<m; i++){
//            System.out.println(adj[i]);
//        }
//        int c = 0;
//        for(int i = 0; i<m; i++){
//            for(int j = 0; j<m; j++){
//                if(c!=i){
//                    if(!vis[j]) dfs(j);
//                }
//                else c++;
//            }
//            if(vis[vertex-1]) System.out.println("YES");
//            else System.out.println("NO");
//        }
    }
    static void dfs (int u){
        if(vis[u]) return;
        vis[u] = true;
        for(int s : adj[u]){
            dfs(s);
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
