/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovegurufastpow;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class LoveGuruFastPow {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String a = readLine().toLowerCase(), b = readLine().toLowerCase();
        int valA = 0, valB = 0;
        for(int i = 0; i<a.length(); i++){
            valA += pow(a.charAt(i)-'a'+1, i+1, 10);
        }
        for(int i = 0; i<b.length(); i++){
            valB += pow(b.charAt(i)-'a'+1, i+1, 10);
        }
        valA %=10; valB %= 10;
        if(valA == 0) valA = 10;
        if(valB == 0) valB = 10;
        System.out.println(valA+valB);
    }
    static int pow(int base, int exp, int mod){
        if(exp == 0) return 1;
        int temp = pow(base, exp/2, mod);
        temp = temp * temp % mod;
        if(exp%2 == 0) return temp;
        return temp*base%mod;
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
