/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqtandcircles;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AQTAndCircles {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
        public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int i = 0; i<T; i++){
            int R1 = readInt(), R2 = readInt(), R3 = readInt();
            int L1 = -R1;
        }
        int x = 0, y = 0; //coordinate pair values --> (0, 0) is the current center
        
        for(;x<y; x++){
            
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
