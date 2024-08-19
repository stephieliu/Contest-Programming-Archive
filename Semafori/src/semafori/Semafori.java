/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semafori;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class Semafori {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
//        int N = readInt(), L = readInt();
//        int [][] lights = new int[N][3];
//        for(int i = 0; i<N; i++){
//            for(int j = 0; j<3; j++){
//                lights[i][j] = readInt();
//            }
//        }
//        int D = 0, time = 0;
        int N = readInt(), L = readInt(), count = 0, c = 0;
        //int[][] arr = new int[N][3];
        //Collect values w/ for loop
        for(int i = 0; i<N; i++){
            //reading values
            //for(int j = 0; j<3; j++){
                //arr[i][j] = readInt();
            int D = readInt(), R = readInt(), G = readInt();
            c += D-count;
            //System.out.println(c);
            count = D;
            for(; c%(R+G) < R;){
                c++;
                //System.out.println(c);
            }
        }
        //System.out.println(c);
        c = c+L-count;
        System.out.println(c);
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
