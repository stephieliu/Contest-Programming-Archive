/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sstringpower;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSStringPower {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static void LPSArray(String str, int M, int lps[]){
        int len = 0, i = 1;
        lps[0] = 0;
        while (i < M){
            if (str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if (len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    
    static long repetition(String str) {
        int n = str.length();
        int lps[] = new int[n];
        LPSArray(str, n, lps);
        int len = lps[n-1];
        if (len>0 && n%(n-len) == 0){
            return n/(n-len);
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException {
        int n = readInt();//number of strings
        for(int i = 0; i<n; i++){
            String t = next();
            System.out.println(repetition(t));
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
