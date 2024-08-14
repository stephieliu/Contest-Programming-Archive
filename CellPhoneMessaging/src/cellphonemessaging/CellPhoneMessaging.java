/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphonemessaging;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class CellPhoneMessaging {

    /**
     * @param args the command line arguments
     * WOW i was so bad at writing before :(
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String word = readLine();
        while(!word.equals("halt")){
            char character = word.charAt(0);
            
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == character){
                    
                }
                else{
                    character = word.charAt(i);
                    
                }
            }
            word = readLine();
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
