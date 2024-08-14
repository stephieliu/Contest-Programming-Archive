/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdeposits;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BigDeposits {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        double P = readDouble(), Y = readDouble(), T = readDouble();
        double div = 0.0;
        for(int i = 1; i<=Y; i++){
            div+=Math.pow((P/100)+1,i);
        }
        div = T/div;
       // System.out.println("---> "+div);
        if(div<1 && T!=1) System.out.println(2);
        else if(div<1 && T==1) System.out.println(1);
        else System.out.println((int)Math.ceil(div));
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
