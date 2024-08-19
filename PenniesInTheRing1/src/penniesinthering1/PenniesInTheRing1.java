/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penniesinthering1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class PenniesInTheRing1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(;;){
            int n = readInt();
            if(n==0) break;
            if(n == 1) System.out.println(5);
            else{
                int a = 1, b = 4*n;
                double c = 4*Math.pow(n/Math.round(Math.sqrt(2)), 2);
                double d = 8*(Math.sqrt(Math.pow(n,2)+Math.pow(n,2)));
                System.out.println(a+b+c+d);
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
