/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscrambler1;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class WordScrambler1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String s = next();
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        String str="";
        for(int i = 0; i<s.length(); i++){
            str+=arr[i];
        }
        strcombination(str, "");
    }
    static void strcombination(String s, String t){
        if(s.length() == 0){
            System.out.println(t); return;
        }
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            String rest = s.substring(0, i)+s.substring(i+1);
            strcombination(rest, t+a);
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
