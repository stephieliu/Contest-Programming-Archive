/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zigzagcoci;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ZigZagCOCI {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int K = readInt(), N = readInt();
        Map<String, Integer> words = new TreeMap<>();
        for(int x = 0; x<K; x++){
            words.put(readLine(), 0);
        }
        //System.out.println(words);
        for(int x = 0; x<N; x++){
            String s = next();
            int min = Integer.MAX_VALUE;
            String word = "";
            for(String key : words.keySet()){
                if(key.substring(0, 1).equals(s) && words.get(key)<min){
                    min = words.get(key);
                    word = key;
                }
            }
            for(String key : words.keySet()){
                if(key.equals(word)){
                    System.out.println(key);
                    int y = words.get(key);
                    //words.remove(key);
                    words.put(key, y+1);
                }
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
