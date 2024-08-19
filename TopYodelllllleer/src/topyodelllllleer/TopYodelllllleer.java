/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topyodelllllleer;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class TopYodelllllleer {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt(), s[] = new int[n+1]; yodel a[] = new yodel[n+1];
        for(int i = 1; i<=n; i++){
            a[i] = new yodel(i, 0,0);
        }
        for(int r = 1; r<=k; r++){
            for(int i = 1; i<=n; i++) s[i] = readInt();
            for(int i = 1; i<=n; i++) a[i].sc += s[a[i].id];
            Arrays.sort(a, 1, n+1, new cmp());
            int rk = 1;
            for(int i = 1; i<=n; i++){
                if(i!=1 && a[i].sc != a[i-1].sc) rk = i;
                a[i].rk = Math.max(a[i].rk, rk);
            }
        }
        for(int i = 1; i<=n; i++){
            if(a[i].sc == a[1].sc)
                System.out.println("Yodeller "+a[i].id+" is the TopYodeller: score "+a[i].sc+", worst rank "+a[i].rk);
        }
    }
    static class cmp implements Comparator<yodel>{
        public int compare(yodel a, yodel b){
            if(a.sc != b.sc) return -Integer.compare(a.sc, b.sc);
            else return Integer.compare(a.id, b.id);
        }
    }
    static class yodel{
        int id, sc, rk;
        yodel(int i0, int s0, int r0){ id = i0; sc = s0; rk = r0;}
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
