/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mimiandprimes;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MimiandPrimes {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        long N = readLong();
        long[] arr = new long[(int)N];
        arr[0] = readLong();
        arr[1] = readLong();
        long g = GCD(arr[0], arr[1]);
        //System.out.println(g);
        for(int i = 2; i<N; i++){
            arr[i] = readLong();
            if(g>1) g = GCD(arr[i], g);
            //System.out.println(g);
        }
        long l = Pfactor(g);
        if(l>1) System.out.println(l);
        else System.out.println("DNE");
    }
    public static long GCD(long x, long y){
        if(x == 0) return y;
        return GCD(y%x, x);
    }
    static long Pfactor(long g) {
        long maxPrime = -1;
        while (g % 2 == 0) {
            maxPrime = 2;
            g /= 2;
        }
        for (int i = 3; i <= Math.sqrt(g); i += 2) {
            while (g % i == 0) {
                maxPrime = i;
                g /= i;
            }
        }
        if (g > 2) {
            maxPrime = g;
        }
        return maxPrime;
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
