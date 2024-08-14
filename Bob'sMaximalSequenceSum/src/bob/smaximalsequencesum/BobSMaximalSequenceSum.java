/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.smaximalsequencesum;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSMaximalSequenceSum {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        long B[] = new long[N-1], A[] = new long[N];
        for(int i = 0; i<N-1; i++) B[i] = readInt();
        A[0] = B[0];
        A[N-1]= B[N-2];
        for(int i = 0; i<N-2; i++){
            A[i+1] = Math.min(B[i], B[i+1]);
        }
        long sum = 0;
        for(long i: A){
            sum+=i;
        }
        System.out.println(sum);
        
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
