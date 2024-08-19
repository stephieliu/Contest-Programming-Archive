/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonomenalreview;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class PhonomenalReview {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int MM = 100005;
    static int N, M, len, far, rt;
    static List<List<Integer>> adj; 
    static boolean[]pho;
    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        pho = new boolean[MM]; adj = new ArrayList<>(MM);
        for(int i = 1; i<=M; i++){
            rt = readInt();
            pho[rt] = true;
        }
        for(int i = 1; i<N; i++){
            int u = readInt(), v = readInt();
            List<Integer> temp = adj.get(u);
            temp.add(v);
            adj.add(u, temp);
            temp = adj.get(v);
            temp.add(u);
            adj.add(v, temp);
        }
        dfs1(rt, -1);
        len = 0; dfs2(rt, -1, 0);
        len = 0;
        dfs2(far, -1, 0);
        System.out.println(2*(N-1)-len);
    }
    static boolean dfs1(int u, int pre){
        for(int v: adj.get(u)){
            if(v!=pre){
                if(dfs1(v,u)) pho[u] = true;
            }
        }
        if(!pho[u]) N--;
        return pho[u];
    }
    static void dfs2(int u, int pre, int dis){
        if(dis>len){
            len = dis;
            far = u;
        }
        for(int v : adj.get(u)){
            if(v!=pre && pho[v]){
                dfs2(v,u,dis+1);
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
