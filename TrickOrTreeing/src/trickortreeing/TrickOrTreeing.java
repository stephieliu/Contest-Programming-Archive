/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trickortreeing;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TrickOrTreeing {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<5; i++){
            char s[] = readLine().toCharArray();
            int max = 0, dep = 0, node = 0, candy = 0;
            for(int j = 0; j<s.length; j++){
                if(s[j] == ' ')continue;
                if(s[j] == '('){
                    dep++;
                    node++;
                }
                else if(s[j] == ')') dep--;
                else{
                    int val = 0;
                    while(j<s.length && Character.isDigit(s[j])){
                        val = val*10 + s[j] - '0';
                        j++;
                    }
                    candy += val;
                    node++;
                    i--;
                }
                max = Math.max(max, dep);
            }
            System.out.println((2*(node-1)-max)+" "+candy);
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
