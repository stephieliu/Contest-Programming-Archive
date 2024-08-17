/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disjointsettest;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DisjointSetTest {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int N, M, p[];
    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        p = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = i;
        }
        List<Integer> ans = new ArrayList();
        for (int i = 1; i <= M; i++) {
            int x = readInt(), y = readInt();
            int fx = find(x), fy = find(y);
            if (fx != fy) {
                p[fx] = fy;
                ans.add(i);
            }
        }
        if (ans.size() != N - 1) {
            System.out.println("Disconnected Graph");
        } else {
            for (int x : ans) {
                System.out.println(x);
            }
        }
    }
    static int find(int d) {
        if (d != p[d]) {
            p[d] = find(p[d]);
        }
        return p[d];
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
