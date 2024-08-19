/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofprimes2;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SumOfPrimes2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int Q = readInt();
        int N = 100000;
        long [] sieve = new long[N+1];
        int[]arr = new int[N+1];
        arr[0] = 1; arr[1] = 1;
        for(int i = 2; i<=Math.sqrt(N); i++){
            if(arr[i] == 0){
                for(int j = i*i; j<=N; j+=i){
                    arr[j] = 1;
                }
            }
        }
        long sum = 0;
        for(int i = 1; i<=N; i++){
            if(arr[i] == 0){
                sum += i;
            }
            sieve[i] = sum;
        }
        for(int i = 0; i<Q; i++){
            int A = readInt(), B = readInt();
            System.out.println(sieve[B]-sieve[A-1]);
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
