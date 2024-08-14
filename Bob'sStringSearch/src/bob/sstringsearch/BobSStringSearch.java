/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sstringsearch;

/**
 *
 * @author steph
 */
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
public class BobSStringSearch {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = next();
        String T = next();
        int count = ( S.split(Pattern.quote(T), -1).length) - 1;
        System.out.println(count);
//        int M = T.length(), N = S.length(), lps[] = new int[M];
//        int j = 0, len = 0, i = 1; lps[0] = 0;
//        while(i<M){
//            if(T.charAt(i) == T.charAt(len)){
//                len++;
//                lps[i] = len;
//                i++;
//            }
//            else{
//                if(len!= 0) len = lps[len-1];
//                else{
//                    lps[i] = len;
//                    i++;
//                }
//            }
//        }
//        int x = 0, res = 0, next = 0;
//        while(x<N){
//            if(T.charAt(j) == S.charAt(x)){
//                j++; x++;
//            }
//            if(j == M){
//                j = lps[j-1];
//                res++;
//                if(lps[j]!= 0) x = ++next;
//                j = 0;
//            }
//            else if(x<N && T.charAt(j)!= S.charAt(x)){
//                if(j!=0) j = lps[j-1];
//                else x = x +1;
//            }
//        }
//        System.out.println(res);
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
