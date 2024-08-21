/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofstarcraft;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WorldOfStarcraft {

    /**
     * @param args the command line arguments
     * This question is about disjoint sets
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int p[];
    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), k = readInt();
        p = new int[n+1];
        for(int i = 1; i<=n; i++){
            p[i] = i;
        }
        String s = readLine();
        for(int i = 1; i<=m; i++){
            int u = readInt();
            int v = readInt();
            if(s.charAt(u-1) == s.charAt(v-1)){
                p[find(u)] = find(v);
            }
        }
        int ans = 0;
        for(int i = 1; i<=k; i++){
            int u = readInt(), v = readInt();
            if(find(u) == find(v)) ans++;
        }
        System.out.println(ans);
    }
    static int find(int d){
        if(p[d]!=d) p[d] = find(p[d]);
        return p[d];
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
