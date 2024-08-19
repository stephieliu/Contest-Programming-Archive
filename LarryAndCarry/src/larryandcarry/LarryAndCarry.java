/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larryandcarry;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class LarryAndCarry {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, a[], cnt;

    public static void main(String[] args) throws IOException {
        n = readInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        fun(0, 0, 0);
        System.out.println(cnt);
    }

    static void fun(int sum, int id, int k) {
        if (id == n) {
            cnt = Math.max(cnt, k);
            return;
        }
        if (check(sum, a[id])) {
            fun(sum + a[id], id + 1, k + 1);
        }
        fun(sum, id + 1, k);
    }

    static boolean check(int a, int b) {
        while (a > 0 && b > 0) {
            if (a % 10 + b % 10 >= 10) {
                return false;
            }
            a /= 10;
            b /= 10;
        }
        return true;
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
