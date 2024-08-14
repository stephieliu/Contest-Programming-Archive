/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.slightsgame;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSLightsGame {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt();
        boolean[] lights = new boolean[N];
        Arrays.fill(lights, false);
        for(int i = 0; i<M; i++){
            int lower = readInt(), upper = readInt();
            for(int x = lower-1; x<upper; x++){
                lights[x] ^= true;
            }
        }
        int count = 0;
        for(int i = 0; i<N; i++){
            if(lights[i] == true){
                count++;
            }
        }
        System.out.println(count);
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
