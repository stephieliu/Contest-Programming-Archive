/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.dpermutations;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DPermutations {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt(), q = readInt();
        int dif[] = new int[n*m+2];
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=m; c++){
                int lo = r*c, hi = n*m - (n-r+1)*(m-c+1)+1;
                dif[lo]++;
                dif[hi+1]--;
            }
        }
        for(int i = 1; i<dif.length; i++){
            dif[i] += dif[i-1];
        }
        for(int i = 1; i<=q; i++){
            System.out.println(dif[readInt()]);
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
