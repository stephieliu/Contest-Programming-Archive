/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundtosecondprime;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class RoundToSecondPrime {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
            97, 101};
        for(int x = 0; x<5; x++){
            int N = readInt(), lower = N, upper = N;
            for(int i = 2; i<primes.length; i++){
                if(primes[i]==N){
                    lower = primes[i-2];
                    upper = primes[i+2];
                    break;
                }
                else if(primes[i]>N){
                    lower = primes[i-2];
                    upper = primes[i+1];
                    break;
                }
            }
            if(N-lower<upper-N){
                System.out.println(lower);
            }
            else{
                System.out.println(upper);
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
