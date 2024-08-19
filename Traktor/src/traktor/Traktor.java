/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traktor;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Traktor {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt(), maxV = (int)1e5;
        int[] row = new int[maxV], col = new int[maxV], lft = new int[2*maxV-1], rit = new int[2*maxV-1];
        for(int i = 1; i<=n; i++){
            int r = readInt()-1, c = readInt()-1;
            row[r]++; col[c]++; lft[r+c]++; rit[r+maxV-1-c]++;
            if(row[r]==k || col[c] == k || lft[r+c]==k||rit[r+maxV-1-c]==k){
                System.out.println(i); return;
            }
        }
        System.out.println(-1);
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
