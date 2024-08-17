/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodingdna;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DecodingDNA {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int i = 1; i<=5; i++){
            String DNA = next();
            int start = DNA.indexOf("TATAAT")+10;
            String complement = complementaryDNA(DNA.substring(start));
            
        }
    }
    static String complementaryDNA(String s){
        String str = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    str+="T";
                    break;
                case 'T':
                    str+="A";
                    break;
                case 'C':
                    str+="G";
                    break;
                default:
                    str+="C";
                    break;
            }
        }
        return str;
    }
    static String complementaryRNA(String s){
        String str = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    str+="U";
                    break;
                case 'T':
                    str+="A";
                    break;
                case 'C':
                    str+="G";
                    break;
                default:
                    str+="C";
                    break;
            }
        }
        return str;
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
