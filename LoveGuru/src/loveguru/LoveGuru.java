/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguru;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
/**
 *
 * @author steph
 */
public class LoveGuru {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String A = next().toUpperCase(), B = next().toUpperCase();
        BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(0);
        for(int i = 1; i<=A.length() || i<=B.length(); i++){
            if(i<=A.length()){
                //eA += Math.pow(A.charAt(i-1)-64, i);
                BigInteger temp = BigInteger.valueOf(A.charAt(i-1)-64);
                a = a.add(temp.pow(i));
            }
            if(i<=B.length()){
                BigInteger temp = BigInteger.valueOf(B.charAt(i-1)-64);
                b = b.add(temp.pow(i));
                //eB += Math.pow(B.charAt(i-1)-64, i);
            }
        }
        a = a.mod(BigInteger.valueOf(10));
        b = b.mod(BigInteger.valueOf(10));
        if(a==BigInteger.valueOf(0)) a = BigInteger.valueOf(10);
        if(b == BigInteger.valueOf(0)) b = BigInteger.valueOf(10);
        System.out.println(a.add(b));
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
