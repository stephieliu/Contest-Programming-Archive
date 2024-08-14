/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlepositions1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class BattlePositions1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int I = readInt();
        int N = readInt();
        int J = readInt();
        int arr[] = new int[10000001];
        int count = 0;
    	for(int i = 0; i < J; i++) { 
            int xi = readInt();
            int xf = readInt();
            int k = readInt();
            arr[xi] += k;
            arr[xf + 1] -= k;
        }
    	if(arr[0] < N){
            count++;
        }
    	for(int i = 1; i < I; i++) { 
            arr[i] += arr[i - 1];
            if(arr[i] < N){
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
