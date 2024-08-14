/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2spooky4me;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), L = readInt(), S = readInt();
        List<pair> list = new ArrayList();
        for(int i = 1; i<=N; i++){
            int x = readInt(), y = readInt(), v = readInt();
            list.add(new pair(x,v)); list.add(new pair(y+1, -v));
        }
        Collections.sort(list);
        int psa = list.get(0).val, len = 0;
        for(int i = 1; i<list.size(); i++){
            if(psa >= S) len += list.get(i).pos - list.get(i-1).pos;
            psa += list.get(i).val;
        }
        System.out.println(L-len);
    }
    static class pair implements Comparable<pair>{
        int pos, val;
        pair(int p0, int v0){
            pos = p0;
            val = v0;
        }
        public int compareTo(pair x){
            return Integer.compare(pos, x.pos);
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
