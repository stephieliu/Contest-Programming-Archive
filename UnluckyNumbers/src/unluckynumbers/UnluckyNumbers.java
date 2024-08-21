/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unluckynumbers;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class UnluckyNumbers {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int K = readInt();
        int [] unnum  = new int[1000001];
        int [] psa = new int[1000001];
        Arrays.fill(psa, 0);
        Arrays.fill(unnum, 0);
        for(int i = 0; i<K; i++){
            unnum[readInt()] = 1;
        }
        for(int i = 1; i<1000001; i++){
            psa[i] = psa[i-1]+unnum[i];
        }
        int N = readInt();
        for(int w = 0; w<N; w++){
            int temp = readInt();
            System.out.println(temp-psa[temp]);
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
