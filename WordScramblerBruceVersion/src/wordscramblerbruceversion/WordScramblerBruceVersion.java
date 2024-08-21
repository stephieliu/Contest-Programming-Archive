/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramblerbruceversion;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WordScramblerBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int t = 1; t<=5; t++){
            char s[] = readLine().toCharArray();
            Arrays.sort(s);
            getPerms(new String(s), "");
        }
    }
    static void getPerms(String word, String perm){
        if(word.length()==0){
            System.out.println(perm);
            return;
        }
        else{
            for(int i = 0; i<word.length(); i++){
                getPerms(word.substring(0, i)+word.substring(i+1), perm+word.charAt(i));
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
