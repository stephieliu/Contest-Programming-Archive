/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofaster;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class GOFaster {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int min = readInt(), max = min, sum = 0;
        int t = readInt();//will always be 0
        for(int i = 1; i<N-1; i++){
            int on = readInt(), off = readInt();
            min-=off;
            if(i==1) max-=off;
            else{
                sum+=on;
                sum-=off;
            }
        }
        if(min<=0) System.out.println("0");
        else System.out.println(min);
        if(sum<0) System.out.println(max+sum);
        else System.out.println(max);
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
