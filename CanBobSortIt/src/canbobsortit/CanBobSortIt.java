/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canbobsortit;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CanBobSortIt {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), arr[]= new int[N], sorted[] = new int[N], diff = 0;
        for(int i = 0; i<N; i++){
            int x = readInt();
            arr[i]= x;
            sorted[i] = x;
        }
        Arrays.sort(sorted);
        for(int i = 0; i<N; i++){
            if(arr[i]!=sorted[i]) diff++;
        }
        if(diff<=2) System.out.println("YES");
        else System.out.println("NO");
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
