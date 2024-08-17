/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granica;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Granica {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int a[] = new int[N];
        for(int i = 0; i<N; i++){
            a[i] = readInt();
        }
        Arrays.sort(a);
        int g = a[1] - a[0];
        for(int i = 2; i<N; i++){
            g = gcd(g, a[i] - a[i-1]);
        }
        for(int i = 2; i<=Math.sqrt(g); i++){
            if(g%i==0){
                System.out.print(i+" ");
                if(i*i!=g){
                    System.out.print(g/i+" ");
                }
            }
        }
        System.out.println(g);
    }
    static int gcd(int m, int n){
        if(n==0) return m;
        else return gcd(n, m%n);
    }
    //time complexity: log(log(n))
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
