/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossnumberpuzzle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author steph
 */
public class CrossNumberPuzzle {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int x = 1000; x<10000; x++){
            int sum = 0;
            for(int i = 1; i<x; i++){
                if(x%i==0){
                    sum+=i;
                }
            }
            if(sum==x){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        for(int x = 100; x<1000; x++){
            String s = Integer.toString(x);
            int sum = 0;
            for(int i = 0; i<s.length(); i++){
                sum+=Math.pow(s.charAt(i)-'0',3);
            }
            if(sum==x){
                System.out.print(x+" ");
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
