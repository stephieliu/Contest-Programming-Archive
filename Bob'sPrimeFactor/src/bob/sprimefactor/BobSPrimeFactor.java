/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sprimefactor;

/**
 *
 * @author steph
 */
import java.io.*;
import java.util.*;
public class BobSPrimeFactor {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = readInt();
        }
        long [] primes = new long[N];
        long[] arr = new long[N];
        for(int j = 0; j<N; j++){
            int n = A[j];
            long maxPrime = -1;
            while(n%2 == 0){
                maxPrime = 2;
                n>>=1;
            }
            for(int i = 3; i<=Math.sqrt(n); i+=2){
                while(n%i == 0){
                    maxPrime = i;
                    n= n/i;
                }
            }
            if(n>2){
                maxPrime = n;
                primes[j] = maxPrime;
                arr[j] = maxPrime;
            }
            else{
                primes[j] = -1;
                arr[j] = maxPrime;
            }
        }
        Arrays.sort(arr);
        long max = arr[N-1];
        for(int i = 0; i<N; i++){
            if(primes[i] == max){
                System.out.println(A[i]);
                break;
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
