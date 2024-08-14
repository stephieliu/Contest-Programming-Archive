/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countodddigitnumbers;

/**
 *
 * @author steph
 */
import java.util.*;
import java.math.*;
import java.io.*;
public class CountOddDigitNumbers {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        BigInteger N = BigInteger.valueOf(readInt());
        if(N.compareTo(BigInteger.valueOf(10))<0) System.out.println(N);
        else if(N.divide(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(10))<0) System.out.println(9);
        else if(N.divide(BigInteger.valueOf(100)).compareTo(BigInteger.valueOf(10))<0) System.out.println(N.add(BigInteger.valueOf(9)).subtract(BigInteger.valueOf(99)));
        else if(N.divide(BigInteger.valueOf(1000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(9+900);
        else if(N.divide(BigInteger.valueOf(10000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(N.add(BigInteger.valueOf(909)).subtract(BigInteger.valueOf(9999)));
        else if(N.divide(BigInteger.valueOf(100000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(909+90000);
        else if(N.divide(BigInteger.valueOf(1000000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(N.add(BigInteger.valueOf(90909)).subtract(BigInteger.valueOf(999999)));
        else if(N.divide(BigInteger.valueOf(10000000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(90909+9000000);
        else if(N.divide(BigInteger.valueOf(100000000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(N.add(BigInteger.valueOf(9090909)).subtract(BigInteger.valueOf(99999999)));
        else if(N.divide(BigInteger.valueOf(1000000000)).compareTo(BigInteger.valueOf(10))<0) System.out.println(9090909+900000000);
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
