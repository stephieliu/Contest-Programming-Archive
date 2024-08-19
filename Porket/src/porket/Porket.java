/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porket;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class Porket {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, sour[], bit[], ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        n = readInt();
        sour = new int[n];
        bit = new int[n];
        for (int i = 0; i < n; i++) {
            sour[i] = readInt();
            bit[i] = readInt();
        }
        List<Integer> com = new ArrayList();
        getCombinations(0, com);
        System.out.println(ans);
    }

    static void getCombinations(int idx, List<Integer> com) {
        if (idx == n) {
            if (com.isEmpty()) {
                return;
            }
            int totSour = 1, totBit = 0;
            for (int id : com) {
                totSour = totSour * sour[id];
                totBit = totBit + bit[id];
            }
            ans = Math.min(ans, Math.abs(totSour - totBit));
            return;
        }
        getCombinations(idx + 1, com);
        com.add(idx);
        getCombinations(idx + 1, com);
        com.remove(com.size() - 1);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
