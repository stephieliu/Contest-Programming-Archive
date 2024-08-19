/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstring;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */

public class LongestSubstring {

    /**
     * @param args the command line arguments
     */
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = next();
        int temp = 0;
        boolean found = false;
        int t = -10;
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i)=='A'&&found==false){
                temp = i;
                found = true;
            }
            if(S.charAt(i)=='Z'&&found==true&&i>t){
                t = i;
            }
        }
        System.out.println(t-temp+1);
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
