/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.snon.increasingsubarray;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSNonIncreasingSubarray {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = readInt();
        }
        int max = 1, len = 1;
        for(int i = 1; i<N; i++){
            if(A[i]<=A[i-1]) len++;
            else{
                if(max<len) max = len;
                len = 1;
            }
        }
        if(max<len) max = len;
        System.out.println(max);
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
