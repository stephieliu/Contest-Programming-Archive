/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack2;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Knapsack2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), W = readInt(), maxV = (int)(1e5+1);
        long dp[] = new long[maxV];
        Arrays.fill(dp, (long)(2e9)); dp[0] = 0;
        for(int i = 1; i<=N; i++){
            int w = readInt(), val = readInt();
            for(int j = maxV-1; j>=val; j--){
                dp[j] = Math.min(dp[j], dp[j-val]+w);
            }
        }
        for(int i = maxV-1; i>=0; i--){
            if(dp[i]<=W){
                System.out.println(i);
                return;
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
