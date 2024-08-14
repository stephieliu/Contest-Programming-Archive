/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sreversenumber;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSReverseNumber {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        long A = readLong(), B = readLong();
        long rA = 0, rB = 0;
        while(A!=0){
            long dig = A%10;
            rA = rA*10+dig;
            A/=10;
        }
        while(B!=0){
            long dig = B%10;
            rB = rB*10+dig;
            B/=10;
        }
        if(rA>rB)
            System.out.println(rB);
        else System.out.println(rA);
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
