/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumgame1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SumGame1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), ans = 0;
        long score1 = 0, score2 = 0;
        int[] n1 = new int[N];
        int [] n2 = new int[N];
        for(int i = 0; i<N; i++){
            n1[i] = readInt();
        }
        for(int i = 0; i<N; i++){
            n2[i] = readInt();
        }
        for(int i = 0; i<N; i++){
            score1 += n1[i];
            score2 += n2[i];
            if(score1 == score2){
                ans = i+1;
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
    static double readDouble () throws   IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
