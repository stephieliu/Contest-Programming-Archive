/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sportaltravel;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSPortalTravel {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod(String n, int m){
        Vector<Integer> v = new Vector<>();
        int mm = 0;
        for(int i = 0; i<n.length(); i++){
            int dig = n.charAt(i) - '0';
            mm = mm * 10 + dig;
            int q = (int)(mm/m);
            v.add(v.size(), q);
            mm = mm%m;
        }
        return mm;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = mod(next(), N);
        int [] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
        }
        System.out.println(arr[N-1-K]);
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
