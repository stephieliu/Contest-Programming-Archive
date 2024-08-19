/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialdistancingibruceversion;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class SocialDistancingIBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt();
        String s = readLine();
        int first = s.indexOf("1"), last = s.lastIndexOf("1");
        if(first<0){
            System.out.println(n-1); return;
        }
        List<Integer> interval = new ArrayList<>();
        int dis2 = 0;
        int min = n+1;
        interval.add(first);
        interval.add(n-1-last);
        dis2 = Math.max(first/2, (n-1-last)/2);
        for(int curr = first, next = 0; curr<last; curr = next){
            next = s.indexOf("1", curr+1);
            interval.add((next - curr)/2);
            dis2 = Math.max(dis2, (next-curr)/3);
            min = Math.min(min, next-curr);
        }
        Collections.sort(interval);
        int ans = Math.max(interval.get(interval.size()-2),dis2);
        System.out.println(Math.min(ans, min));
        
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
