/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mimi.binary;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MimiBinary {

    /**
     * @param args the command line arguments
     * the command line arguments
     * List<Integer> zeroes represents the indexes of zeroes
     * The problem at the moment is that when the starting index
     * is not 1, the answer gets all messed up. Not sure how to
     * fix it yet.
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String S = next();
        List<Integer> zeroes = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == '0') zeroes.add(i);
            else ones.add(i);
        }
        int Q = readInt();
        for(int i = 0; i<Q; i++){
            int x = readInt(), y = readInt(), z = readInt();
            int index = x+y-2;
            if(z == 0 && index<zeroes.size()){
                System.out.println(zeroes.get(index)+1);
            }
            else if(z == 1 && index<ones.size()){
                System.out.println(ones.get(index)+1);
            }
            else System.out.println(-1);
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
