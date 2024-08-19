/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theloveletter;

/**
 *
 * @author steph
 */
import java.io.*;
import java.util.*;
public class TheLoveLetter {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), L = readInt()%26;
        String s = readLine();
        if(N>s.length()){
            while(s.length()<N){
                s+=" ";
            }
        }
        String result = "";
        for(int i = 0; i<N; i++){
            int c = s.charAt(i);
            if(c!= 32 && c<123-L){
                c+=L;
            }
            else if(c>=123-L) c-=(26-L);
            result+=(char)c;
        }
        System.out.println(result);
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
