/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class Method2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static String removeAll(String input, String input1){
        int index = input.indexOf(input1);
        while(index>=0){
            input = input.substring(0, index)+input.substring(index+input1.length());
            index = input.indexOf(input1);
            
        }
        return input;
    }
    public static void main(String[] args) throws IOException {
        String x = readLine();
        String y = readLine();
        System.out.println(removeAll(x, y));
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
