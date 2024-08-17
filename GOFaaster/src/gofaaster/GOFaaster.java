/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofaaster;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class GOFaaster {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), on[] = new int[n], off[] = new int[n];
        for(int i =0; i<n-1; i++){
            on[i] = readInt();
            off[i] = readInt();
        }
        int min = on[0];
        for(int i = 0; i<n; i++){
            min-=off[i];
        }
        if(min<0) min = 0;
        int max = (int)1e9;
        int curr = on[0];
        for(int i = 1; i<n; i++){
            curr-=off[i];
            max = Math.min(max, curr);
            curr+=on[i];
        }
        System.out.println(min+""
                + "\n"+max);
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
