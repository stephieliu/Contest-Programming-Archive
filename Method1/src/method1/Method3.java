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
public class Method3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    static void palindrome(String input){
        input = input.replaceAll("[^\\p{IsDigit}\\p{IsAlphabetic}]", "");
        int length = input.length();
        boolean yes = true;
        for(int i = length-1, j = 0; i>-1 && j<length; i--, j++){
            if(input.charAt(i)!=input.charAt(j)){
                yes = false;
                break;
            }
        }
        if(yes==false){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
    public static void main(String[] args) throws IOException {
        String x = readLine().toLowerCase();
        palindrome(x);
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
