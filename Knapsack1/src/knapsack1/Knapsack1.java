/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Knapsack1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static long max(long a, long b){
        return (a>b)?a:b;
    }
    static long knapsack(int N, int W, int[] w, int[] val){
        long[][] k = new long[N+1][W+1];
        for(int i = 0; i<=N; i++){
            for(int y = 0; y<=W; y++){
                if(i == 0 || y == 0){
                    k[i][y] = 0;
                }
                else if(w[i-1]<=y){
                    k[i][y] = max(val[i-1]+k[i-1][y-w[i-1]],k[i-1][y]);
                }
                else k[i][y] = k[i-1][y];
            }
        }
        return k[N][W];
    }
    public static void main(String[] args) throws IOException {
        int N = readInt(), W = readInt(), w[] = new int[N], val[] = new int[N];
        for(int i = 0; i<N; i++){
            w[i] = readInt(); val[i] = readInt();
        }
        long[][] arr = new long[N+1][W+1];
        for(int i = 0; i<W+1; i++){
            arr[0][i] = 0;
        }
        for(int i = 0; i<N+1; i++){
            arr[i][0] = 0;
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=W; j++){
                long max1 = arr[i-1][j];
                long max2 = 0;
                long w1 = w[i-1];
                if(j>=w1){
                    max2 = val[i-1];
                    long rc = i-w1;
                    max2 += arr[i-1][(int)rc];
                }
                arr[i][j] = Math.max(max1, max2);
            }
        }
        System.out.println(arr[N][W]);
//        System.out.println(knapsack(N, W, w, val));
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
