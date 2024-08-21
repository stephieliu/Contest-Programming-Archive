/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordprocessor1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WordProcessor1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int count = 0;
        String word = next();
        for(int i = 0; i<N; i++){
            count += word.length();
            String nextword = "";
            int nextcount = 0;
            if(i<N-1){
                nextword = next();
                nextcount = count+nextword.length();
            }
            else nextcount = 1000000000;
            if(count<=K && nextcount<=K){
                System.out.print(word+" ");
            }
            else if(count<=K && nextcount>K){
                System.out.print(word);
            }
            else if(count>K){
                count = word.length();
                nextcount = count+nextword.length();
                if(i == N-1) nextcount = 1000000000;
                if(nextcount<=K) System.out.print("\n"+word+" ");
                else System.out.print("\n"+word);
            }
            word = nextword;
        }
        System.out.println();
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
