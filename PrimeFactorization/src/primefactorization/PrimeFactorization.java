/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactorization;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class PrimeFactorization {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String primeFactors(long n){ 
        while (n%2==0){ 
            System.out.print(2 + " "); 
            n /= 2; 
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2){ 
            while (n%i == 0){ 
                System.out.print(i + " "); 
                n /= i; 
            } 
        }
        if (n > 2){
            System.out.print(n);
        }
        return"";
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int yo = 0; yo<N; yo++){
            long M = readLong();
            System.out.println(primeFactors(M));
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
