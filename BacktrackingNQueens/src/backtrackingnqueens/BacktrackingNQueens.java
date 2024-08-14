/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrackingnqueens;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class BacktrackingNQueens {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, row[]; static boolean col[], lft[], rit[];
    public static void main(String[] args) throws IOException {
        n = readInt(); row = new int[n]; col = new boolean[n]; lft = new boolean[2*n-1]; rit = new boolean[2*n-1];
        placeQ (0);
    }
    static void placeQ(int r){
        if(r==n){//base case is find out a solution and print
            System.out.println("=================================");
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print(row[i]==j? "Q":".");
                }
                System.out.println();
            }
            return;
        }
        for(int c = 0; c<n; c++){
            if(!col[c] && !lft[r+c] && !rit[r+n-1-c]){
                row[r] = c; col[c] = lft[r+c] = rit[r+n-1-c] = true;
                placeQ(r+1);
                col[c] = lft[r+c] = rit[r+n-1-c] = false;
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
