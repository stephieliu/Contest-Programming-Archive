/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingtheccc1;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class WritingTheCCC1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        String type[] = new String[T];
        Map<String, List<Integer>> map = new HashMap();
        for(int i =0; i<T; i++){
            type[i] = readLine();
            map.put(type[i], new ArrayList());
        }
        int N = readInt();
        for(int i = 1; i<=N; i++){
            String problem = readLine();
            map.get(problem).add(i);//.get gives the value
            //you want to put i into the list (value) at
            //the key of problem
        }
        for(int i = 0; i<T; i++){
            for(int x: map.get(type[i])){
                System.out.println(x);
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
