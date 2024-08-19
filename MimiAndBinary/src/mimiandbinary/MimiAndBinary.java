/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mimiandbinary;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class MimiAndBinary {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = readLine();
        int Q = readInt();
        ArrayList <Integer> ones = new ArrayList<>();
        ArrayList <Integer> zeroes = new ArrayList<>();
        for(int i = 0; i<Q; i++){
            int x = readInt(), y = readInt(), count = 0;
            char z = next().charAt(0);
            boolean found = false;
            for(int j = x-1; j<S.length(); j++){
                if(count==y){
                    System.out.println(j);
                    found = true;
                    break;
                }
                else{
                    if(S.charAt(j)==z){
                        count++;
                    }
                }
            }
            if(found == false){
                System.out.println(-1);
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
