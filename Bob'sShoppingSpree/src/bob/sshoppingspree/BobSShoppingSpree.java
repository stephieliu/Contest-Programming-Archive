/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sshoppingspree;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSShoppingSpree {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int MM = 1005;
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt(), K = readInt();
        int w[] = new int[MM]; int v[] = new int[MM]; long dp[] = new long[MM];
        for(int i = 1; i<=N; i++){
            w[i] = readInt();
            v[i] = readInt();
            for(int j = w[i]; j<=K; j++){
                dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
            }
        }
        for(int i = 1, q, t, d, a; i<=M; i++){
            q = readInt(); t = readInt(); d = readInt(); a = readInt();
            for(int k = 1; k<=a; k = k*2){
                long cost = (long)k*d, val = (long)k*q*v[t];
                for(int j = K; j>=cost; j--){
                    dp[j] = Math.max(dp[j], dp[j-(int)cost]+val);
                }
                a-= k;
            }
            if(a>0){
                long cost = (long)a*d, val = (long)a*q*v[t];
                for(int j = K; j>=cost; j--){
                    dp[j] = Math.max(dp[j], dp[j-(int)cost]+val);
                }
            }
        }
        System.out.println(dp[K]);
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
