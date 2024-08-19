/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterngenerator;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class PatternGenerator {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int first = readInt();
        for(int deku = 0; deku<first; deku++){
            int n = readInt(), k = readInt();
            String print = "";
            System.out.println("The bit patterns are");
            for(int i = 0; i<k; i++){
                print = print+"1";
                for(; i<n; i++){
                    print = print + "0";
                }
            }
            int x = print.lastIndexOf("10");
            while(x>=0){
                System.out.println(print);
                StringBuilder sb = new StringBuilder(print.substring(x+2));
                print = print.substring(0, x)+"01"+sb.reverse();
                x = print.lastIndexOf("10");
            }
            System.out.println(print);
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
