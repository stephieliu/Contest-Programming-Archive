/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockofstack;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BlockOfStack {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, T, ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = readInt();
        T = readInt();
        int a[] = new int[N];
        List<Integer> comb = new ArrayList();
        for (int i = 0; i < N; i++) {
            a[i] = readInt();
        }
        fun(a, 0, comb);
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    static void fun(int a[], int id, List<Integer> comb) {
        if (id == a.length) { //base case
            int sum = 0;
            for (int x : comb) {
                sum += x;
            }
            if (sum >= T) {
                ans = Math.min(ans, sum - T);
            }
            return;
        }
        fun(a, id + 1, comb);
        comb.add(a[id]);
        fun(a, id + 1, comb);
        comb.remove(comb.size() - 1);
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
