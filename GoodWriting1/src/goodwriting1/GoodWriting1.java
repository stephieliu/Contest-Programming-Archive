/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodwriting1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class GoodWriting1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long len[] = new long[31];
    static String base = "Good writing is good writing is good writing.", pre = "Good writing is good ", mid = " writing is good ", suf = " is good writing.";
    public static void main(String[] args) throws IOException {
        len[0] = base.length();
        for(int i = 1; i<=30; i++){
            len[i] = pre.length() + len[i-1]+mid.length()+len[i-1]+suf.length();
        }
        int Q = readInt();
        for(int i = 1; i<=Q;i++){
            int lvl = readInt(), idx = readInt()-1;
            if(idx >= len[lvl]) System.out.println(".");
            else System.out.println(fun(lvl, idx));
        }
    }
    static char fun(int lvl, int idx){
        if(lvl == 0) return base.charAt(idx);
        int sz = pre.length();
        if(idx < sz) return pre.charAt(idx);
        if(idx < sz + len[lvl-1]) return fun(lvl-1, idx-sz);
        sz += len[lvl-1];
        if(idx <sz + mid.length()) return mid.charAt(idx-sz);
        sz+= mid.length();
        if(idx < sz + len[lvl-1]) return fun(lvl-1, idx-sz);
        sz += len[lvl-1];
        return suf.charAt(idx-sz);
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
