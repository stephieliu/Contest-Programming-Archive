/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Triangles {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [] x = new int [N];
        int [] y = new int [N];
        for(int i = 0; i<N; i++){
            x[i]= readInt();
            y[i] = readInt();
        }
        int ans = 0;
        for(int i = 0; i<N; i++){//point i = right angle
            for(int j =0; j<N; j++){
                for(int k = 0; k<N; k++){
                    if(x[i]==x[j] && y[i]==y[k]){
                        ans= Math.max(ans, Math.abs(y[i]-y[j])*Math.abs(x[i]-x[k]));
                    }
                }
            }
        }
        System.out.println(ans);
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
