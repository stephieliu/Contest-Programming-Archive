/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfavouritedigit;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MyFavouriteDigit {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<5; i++){
            String s = next();
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<s.length(); j++){
                int curr = s.charAt(j);
                if(curr>max){
                    max = curr;
                }
            }
            System.out.println(max-48);
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
