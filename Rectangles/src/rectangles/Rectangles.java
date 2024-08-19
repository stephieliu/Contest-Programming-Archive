/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 *
 * @author steph
 */
import java.util.*;

import java.io.*;
public class Rectangles {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), x[] = new int[n], y[] = new int[n], ans = 0;
        Set<point> set = new HashSet();
        for(int i = 0; i<n; i++){
            x[i] = readInt(); y[i] = readInt(); set.add(new point(x[i], y[i]));
            for(int j = 0; j<i; j++){
                if(set.contains(new point(x[i], y[i])) && set.contains(new point(x[j], y[i]))){
                    ans = Math.max(ans, Math.abs(x[i]-x[j])*Math.abs(y[i] - y[j]));
                }
            }
        }
        System.out.println(ans);
    }
    static class point{
        int x, y;
        point(int x0, int y0){ x = x0; y = y0;}
        public int hashCode(){
            return Objects.hash(x, y);
        }
        public boolean equals(Object a){
            point pa = (point)a;
            return x == pa.x && y = pa.y;
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
