/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harambe;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class Harambe {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = readLine();
        String T = readLine();
        int K = readInt();
        int count = 0;
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i)!=T.charAt(i)){
                
                count++;
                if(S.charAt(i)==' '||T.charAt(i)==' '){
                    count = K+1;
                    break;
                }
            }
        }
        if(count>K){
            System.out.println("No plagiarism");
        }
        else{
            System.out.println("Plagiarized");
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
