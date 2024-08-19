/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim.salgorithm;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class PrimSAlgorithm {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int MM = 1002;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), x[], y[]; double adj[][], dis[]; boolean vis[];
        x = new int[MM]; y = new int[MM]; adj = new double[MM][MM];
        dis = new double[MM]; vis = new boolean[MM];
        for(int i = 1; i<=n; i++){
            x[i] = readInt(); y[i] = readInt();
            for(int j = 1; j<i; j++){
                adj[i][j] = adj[j][i];
                
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
