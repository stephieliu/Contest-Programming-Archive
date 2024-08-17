/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farthestpath;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class FarthestPath {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int M = readInt(), N = readInt(), U = readInt(), F = readInt(), D = readInt();
        String s = next();
        int[] dis = new int[N];
        char c = s.charAt(0);
        if(c == 'u' || c == 'd'){
            dis[0] = U+D;
        }
        else dis[0] = F+F;
        for(int i = 1; i<N; i++){
            c = s.charAt(i);
            dis[i] += dis[i-1];
            if(c == 'u' || c == 'd'){
                dis[i] += U+D;
            }
            else if(c == 'f') dis[i] += F+F;
        }
        for(int i = 0; i<N; i++){
            if(M<dis[i]){
                System.out.println(i);
                break;
            }
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
