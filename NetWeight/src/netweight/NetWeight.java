/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netweight;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class NetWeight {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int []arr = new int[N];
        for(int i = 0; i<N; i++){
            int w = readInt();
            if(w<=100)
                arr[i] = w;
        }
        if(arr.length>1){
            Arrays.sort(arr);
            System.out.println(arr[arr.length-1]+arr[arr.length-2]);
        }
        else if(arr.length==1) System.out.println(arr[0]);
        else System.out.println(0);
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
