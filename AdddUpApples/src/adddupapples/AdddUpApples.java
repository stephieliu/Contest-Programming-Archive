/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adddupapples;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AdddUpApples {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N = 0, count = 0;

    public static void main(String[] args) throws IOException {
        N = readInt();
        for (int i = 1; i <= N / 2; i++) {
            fun(i, i, N + "=" + i);
        }
        System.out.println("total=" + count);
    }
    static void fun(int pre, int sum, String ans) {
        if (sum == N) {
            count++;
            System.out.println(ans);
            return;
        }
        for (int i = pre; i <= N - sum; i++) {
            fun(i, sum + i, ans + "+" + i);
        }
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
