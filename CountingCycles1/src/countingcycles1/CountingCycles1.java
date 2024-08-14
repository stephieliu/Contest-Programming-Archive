package countingcycles1;
import java.util.*;
import java.io.*;
public class CountingCycles1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, cycle; static boolean adj[][], vis[];
    public static void main(String[] args) throws IOException {
        n = readInt();
        adj = new boolean[n+1][n+1];
        vis = new boolean[n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                adj[i][j] = readInt() == 1;
            }
        }
        for(int i = 1; i<=n; i++) dfs(i,i);
        System.out.println(cycle);
    }
    static void dfs(int start, int cur){
        vis[cur] = true;
        for(int v = 1; v<=n; v++){
            if(!adj[cur][v])continue;
            if(v == start) cycle++;
            else if(!vis[v]&&v>start) dfs(start, v);
        }
        vis[cur] = false;
        
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