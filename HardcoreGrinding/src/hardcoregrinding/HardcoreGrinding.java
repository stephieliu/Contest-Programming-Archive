/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcoregrinding;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class HardcoreGrinding {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), arr[] = new int[10000001];
        Arrays.fill(arr, 0);
        for(int i =0; i<N; i++){
            int s = readInt(), f = readInt();
            arr[s]++; arr[f]--;
        }
        int [] prefixsum = new int[10000001];
        prefixsum[0] = arr[0];
        int max = prefixsum[0];
        for(int i = 1; i<arr.length; i++){
            prefixsum[i] = prefixsum[i-1] + arr[i];
            if(prefixsum[i]>max){
                max = prefixsum[i];
            }
        }
        System.out.println(max);
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
