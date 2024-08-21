/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wetmud;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WetMud {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), jump = readInt();
        if (jump > n) {
            System.out.println(0);
            return;
        }
        List<pair> list = new ArrayList();
        for (int i = 0; i < m; i++) {
            list.add(new pair(readInt(), readInt()));
        }
        Collections.sort(list);
        PriorityQueue<Integer> q = new PriorityQueue();
        int cur = 0, time = 0;
        q.add(n + 1);
        for (pair e : list) {
            time = e.t;
            q.add(e.p);
            while (!q.isEmpty() && q.peek() <= cur + jump) {
                cur = Math.max(cur, q.poll());
            }
            if (cur == n + 1){
                break;
            }
        }
        System.out.println(cur == n + 1 ? time : -1);
    }
    static class pair implements Comparable<pair> {
        int p, t;
        pair(int p0, int t0) {
            p = p0;
            t = t0;
        }
        public int compareTo(pair x) {
            return Integer.compare(t, x.t);
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
