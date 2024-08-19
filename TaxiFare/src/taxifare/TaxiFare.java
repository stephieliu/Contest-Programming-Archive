/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxifare;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class TaxiFare {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), K = readInt(), a = readInt(), b = readInt();
        double fare = 0;
        fare = Math.min(N,K)*a+Math.max(N,K)*b;
        
//        for(int i = 0; i<N; i++){
//            if(i<K){
//                fare+= a;
//            }
//            else{
//                fare+= b;
//            }
//        }
        
//        N-=K;
//        BigInteger fare = BigInteger.valueOf(K*a);
//        fare=fare.add(BigInteger.valueOf(N*b));
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println(df.format(fare));
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
