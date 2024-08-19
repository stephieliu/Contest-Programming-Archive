/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberoffactors1;

/**
 *
 * @author steph
 * 
 */
import java.io.*;
import java.util.*;
public class NumberOfFactors1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void primeFactors(int n) {
        int count = 0;
        if(n == 2){
            System.out.println(count);
        }
        else{
            while (n % 2 == 0) {
                count++;
                n /= 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
            }
            if (n > 2&& count>0) {
                count++;
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) throws IOException {
        for(int cc = 0; cc<5; cc++){
            int N = readInt();
//            boolean isPrime = false;
//            int c = 0;
//            for(int i = 1; i<Math.sqrt(N); i++){
//                if(N%i ==0) c++;
//            }
//            if(c == 2) isPrime = true;
//            int count = 0;
//            if(N>3 && !isPrime){
//                for(int i = 2; i<=N; i++){
//                    while(N%i == 0){
//                        count++;
//                        N/=i;
//                        System.out.print(i+" ");
//                    }
//                }
//            }
            primeFactors(N);
//            System.out.println(count);
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
