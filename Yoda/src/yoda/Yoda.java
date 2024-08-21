/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoda;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Yoda {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = readLine();
        String[] s = S.split(",");
//        System.out.println(Arrays.toString(s));
        String s1 = S.substring(0, S.indexOf(",")), s2 = S.substring(S.indexOf(","),S.length()-1);
        String punct = S.charAt(S.length()-1)+"";
        if(s1.length()>0) s1 = s1.substring(0,1).toLowerCase()+s1.substring(1);
        if(s1.length()>0)s2+=" ";
        String print = s2.substring(1)+s1+punct;
        System.out.println(print.substring(1,2).toUpperCase()+print.substring(2));
//        char upper = Character.toUpperCase(s2.charAt(0));
//        char lower = Character.toLowerCase(s[0].charAt(0));
//        if(s[1].length()>1){
//            s2 = s[1].substring(2,s[1].length()-1)+" ";
//            upper = Character.toUpperCase(s[1].charAt(1));
//        }
//        if(s[0].length()>1){
//            s1 = s[0].substring(1)+".";
//            lower = Character.toLowerCase(s[0].charAt(0));
//        }
//        System.out.println(upper+s2+lower+s1);
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
