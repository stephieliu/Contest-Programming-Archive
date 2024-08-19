/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marathon;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Marathon {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), Q = readInt();
        int[] arr = new int[N], psa = new int[N+1];
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
        }
        psa[1] = arr[0];
        for(int i = 2; i<=N; i++){
            psa[i] = psa[i-1]+arr[i-1];
        }
        //System.out.println(Arrays.toString(psa));
        for(int i = 0; i<Q; i++){
            int a = readInt(), b = readInt();
            System.out.println(psa[N]-(psa[b]-psa[a-1]));
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
