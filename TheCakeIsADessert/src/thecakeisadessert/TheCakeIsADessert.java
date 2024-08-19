/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecakeisadessert;

import java.io.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author steph
 */
public class TheCakeIsADessert {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt(), K = readInt();
        int [][] cake = new int[M][N];
        DecimalFormat df = new DecimalFormat("###.#");
        for(int i = 0; i<K; i++){
            int x = readInt(), y = readInt(), X = readInt(), Y = readInt();
            for(int l = M-y; l>M-Y-1; l--){
                for(int j = x-1; j<X; j++){
                    cake[l][j]++;
                }
            }
        }
        int Q = readInt();
        for(int i = 0; i<Q; i++){
            double icing = 0;
            int A = readInt(), B = readInt(), C = readInt(), D = readInt();
            for (int l = M - B; l > M - D - 1; l--) {
                for (int j = A - 1; j < C; j++) {
                    icing += cake[l][j];
                }
            }
            System.out.println(df.format(icing));
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
