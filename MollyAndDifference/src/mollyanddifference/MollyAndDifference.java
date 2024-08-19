/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mollyanddifference;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MollyAndDifference {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr);
        int d = Integer.MAX_VALUE;
        for(int i = 0; i<N-1; i++){
            if(Math.abs(arr[i]-arr[i+1])<d){
                d = Math.abs(arr[i]-arr[i+1]);
            }
        }
        System.out.println(d);
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
