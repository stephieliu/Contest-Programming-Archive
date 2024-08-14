/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplusb.hard;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class APlusBHard {

    /**
     * @param args the command line arguments
     */
    static Integer carry = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static ArrayList<String> findSum(String a, String b) {
        ArrayList<String> res = new ArrayList<String>();
        StringBuilder myString = null;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (true) {
            int i1 = Integer.parseInt(Character.toString(a.charAt(i)));
            int i2 = Integer.parseInt(Character.toString(b.charAt(j)));
            Integer i3 = i1 + i2 + carry;
            if (i3 > 9) {
                carry = 1;
                i3 = i3 - 10;
            } else {
                carry = 0;
            }
            res.add(i3.toString());
            i--;
            j--;
            if (i < 0) {
                res.add(carry.toString());
                break;
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int i = 0; i<N; i++){
            String s = next();
            String s1 = next();
            List<String> res = findSum(s, s1);            
            for (String r : res) {
                System.out.print(r);
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
