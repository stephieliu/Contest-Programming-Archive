/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrka;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Utrka {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
//        List<String> names = new ArrayList<>();
//        for(int i = 0; i<N; i++){
//            names.add(next());
//        }
//        for(int i = 0; i<N-1; i++){
//            String search = next();
//            if(names.contains(search)){
//                names.remove(search);
//            }
//        }
//        System.out.println(names.get(0));
        Map<String, Integer> names = new HashMap<>();
        for(int i = 0; i<N; i++){
            String s = next();
            if(!names.containsKey(s)){
                names.put(s, 0);
            }
            else{
                int n = names.get(s);
                names.remove(s);
                names.put(s, n+1);
            }
        }
        //System.out.println(names);
        for(int i = 0; i<N-1; i++){
            String s = next();
            if(names.get(s) == 0){
                names.remove(s);
            }
            else{
                int n = names.get(s);
                names.remove(s);
                names.put(s, n-1);
            }
        }
        System.out.println(names.keySet().toArray()[0]);
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
