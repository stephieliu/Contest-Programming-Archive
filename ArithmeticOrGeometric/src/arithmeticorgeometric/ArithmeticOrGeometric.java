/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticorgeometric;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ArithmeticOrGeometric {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long ans = (long)1e9+7;
    public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int jjj = 0; jjj<T; jjj++){
            long t1 = readLong(), t2 = readLong(), t3 = readLong();
            long k = readLong();
            long d1 = t2-t1, d2 = t3-t2;
            if(d1 == d2){//arithmetic sequence
                System.out.println((t1+(k-1)*d1%ans)%ans);
            }
            else{//geometric sequence
                long r1 = t2/t1;
                System.out.println(t1*pow(r1, k-1)%ans);
//                System.out.println(pow(seq[0]*pow(r1, k-1), 1)%(10^9+7));
            }
        }
    }
    static long pow(long base, long exp) {
        if (exp == 0) {
            return 1;
        }
        long temp = pow(base, exp / 2);
        temp = temp * temp%ans;
        if (exp % 2 == 0) {
            return temp;
        }
        return temp * base%ans;
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
