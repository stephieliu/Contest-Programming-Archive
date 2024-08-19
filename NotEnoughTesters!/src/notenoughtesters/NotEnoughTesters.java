/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notenoughtesters;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class NotEnoughTesters {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int MV = 100000, fact[] = new int[MV + 1];
        List<Integer> list[] = new ArrayList[MV + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList();
        }
        for (int i = 1; i <= MV; i++) {
            for (int j = i; j <= MV; j += i) {
                fact[j]++;
            }
            list[fact[i]].add(i);
        }
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            int k = readInt(), a = readInt(), b = readInt(), count = 0;
            int pa = Collections.binarySearch(list[k], a);
            if (pa < 0) {
                pa = -pa - 1;  //find the first one > a
            }
            int pb = Collections.binarySearch(list[k], b);
            if (pb < 0) {
                pb = -pb - 2;  //find the last one <= b;
            }
            System.out.println(pb - pa + 1);
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
