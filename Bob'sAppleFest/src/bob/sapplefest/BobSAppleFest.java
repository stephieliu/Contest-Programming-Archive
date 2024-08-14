/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sapplefest;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSAppleFest {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long GCD(long a, long b){
        if(a == 0) return b;
        return GCD(b%a, a);
    }
    static long LCM(long a, long b){
        return(a/GCD(a, b))*b;
    }
    public static void main(String[] args) throws IOException {
        long x = readLong(), y = readLong();
        
        System.out.println(LCM(Math.min(x, y), Math.max(x, y)));
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
