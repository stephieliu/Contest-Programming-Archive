/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daisychains;

/**
 *
 * @author steph
 */
import java.io.*;
import java.util.*;
public class DaisyChains {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        long prefixsum[] = new long[N+1];
        prefixsum[0] = 0;
        long arr[] = new long[N+1];
        for(int i = 1; i<=N; i++){
            arr[i] = readLong();
            prefixsum[i] = prefixsum[i-1]+arr[i];
        }
        long avgf = N;
        for(int len = 2; len <=N; len++){
            for(int i = 1; i<=N-len+1; i++){
                long sum = prefixsum[i+len-1] - prefixsum[i-1];
                for(int j = i; j<i+len; j++){
                    if(arr[j]*len == sum){
                        avgf++; break;
                    }
                }
            }
        }
        System.out.println(avgf);
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
