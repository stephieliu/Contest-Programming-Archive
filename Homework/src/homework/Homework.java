/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        int MV = (int)1e7;
        int f[] = new int[MV+1];
        for(int i = 2; i<=MV; i++){
            if(f[i]==0){
                for(int j = i; j<=MV; j+=i){
                    f[j] ++;
                }
            }
        }
        for(int t= 1; t<=T; t++){
            int A = readInt(), B = readInt(), K = readInt(), count = 0;
            for(int i =A; i<=B; i++){
                if(f[i]==K){
                    count++;
                }
            }
            System.out.println("Case # "+t+" : "+count);
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
