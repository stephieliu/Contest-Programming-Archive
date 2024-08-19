/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lights.goin.on.an.off;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class LIGHTSGoinONAnOFF {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int R = readInt(), L = readInt();
        Set<String> set[] = new HashSet[R];
        String light[] = new String[R];
        for(int i = 0; i<R; i++){
            set[i] = new HashSet(); light[i] = "";
            for(int j =0; j<L; j++){
                light[i]+=next();
            }
        }
        set[0].add(light[0]);
        for(int i = 1; i<R; i++){
            set[i].add(light[i]);
            for(String t: set[i-1]){
                set[i].add(xor(t,light[i]));
            }
        }
        System.out.println(set[R-1].size());
    }
    static String xor(String a, String b){
        String c = "";
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)==b.charAt(i)){
                c+="0";
            }
            else{
                c+="1";
            }
        }
        return c;
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
