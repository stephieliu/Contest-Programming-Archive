/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static boolean isPrime(int n){
        for(int i=2; i<=(int)(Math.sqrt(n)); i++){
           if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        int T = readInt();
        int [] primacy = new int[100000001];
        //Use a sieve to find primacy; increment by 1 for 
        //every prime factor.
        for(int i = 2; i<10000000; i++){
            if(isPrime(i)){
                for(int j = i-1; j<100000001; j+=i){
                    primacy[j]++;
                }
            }
        }
        //System.out.println(Arrays.toString(primacy));
        for(int x = 1; x<=T; x++){
            int A = readInt(), B = readInt(), K = readInt(), count = 0;
            for(int i = A-1; i<B; i++){
                if(primacy[i]==K) count++;
            }
            System.out.println("Case #"+x+": "+count);
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
