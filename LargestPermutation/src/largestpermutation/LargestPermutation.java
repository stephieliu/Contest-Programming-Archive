/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestpermutation;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class LargestPermutation {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int [] arr = new int [N+1];
        int pos[] = new int [N+1];
        for(int i = 1; i<=N; i++){
            arr[i] = readInt();
            pos[arr[i]] = i;
        }
        for(int i = 1; i<=N && K>0; i++){
            if(arr[i]<N-i+1){
                int nxt = pos[N-i+1];
                int temp = arr[i];
                arr[i] = arr[nxt];
                arr[nxt] = temp;
                temp = pos[arr[i]];
                pos[arr[i]] = pos[arr[nxt]];
                pos[arr[nxt]] = temp;
                K--;
            }
            
        }
        for(int i = 1; i<=N; i++){
            System.out.print(arr[i]+" ");
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
