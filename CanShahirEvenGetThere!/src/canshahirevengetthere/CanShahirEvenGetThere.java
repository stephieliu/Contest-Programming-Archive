/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canshahirevengetthere;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CanShahirEvenGetThere {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt(), m = readInt(), A = readInt(), B = readInt();
        List<Integer> adj[] = new ArrayList[n+1];
        for(int i = 0; i<=n; i++){
            adj[i] = new ArrayList();
        }
        for(int i = 1; i<=m; i++){
            int u = readInt(), v = readInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        Queue<Integer> q = new LinkedList();
        boolean vis[] = new boolean[n+1];
        int dis[] = new int[n+1];
        //int pre[] = new int[n+1];
        //pre[A] = -1;
        q.add(A);
        vis[A] = true;
        dis[A] = 0;
        //BFS:
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt: adj[cur]){
                if(!vis[nxt]){
                    q.add(nxt); vis[nxt] = true;
                    //pre[nxt] = cur;
                    dis[nxt] = dis[cur]+1;
                }
            }
        }
        //End BFS.
        if(vis[B]){
            System.out.println("GO SHAHIR!");
            //Shortest path dis = dis[B]
            //for(int i = B; i!=-1; i = pre[i]) System.out.print(i+"<--");
            //The line above ^^ will show the actual steps in the path.
        }
        else System.out.println("NO SHAHIR!");
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
