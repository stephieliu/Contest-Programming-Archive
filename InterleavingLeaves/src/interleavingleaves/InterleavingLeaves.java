/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interleavingleaves;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class InterleavingLeaves {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int ll = 0; ll<T;ll++){
            int N = readInt();
            char[] pile1 = next().toCharArray();
            char[] pile2 = next().toCharArray();
            String result = "";
            for(int i = N-1; i>-1; i--){
                result+=pile2[i];
                result+=pile1[i];
            }
            System.out.println(result);
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
