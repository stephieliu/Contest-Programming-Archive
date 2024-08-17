/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade10math;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class Grade10Math {

    /**
     * @param args the command line arguments
     */
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        System.out.println(largestPowerOfK(b, a));
    }
    static class pair {
        int first, second;
        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    static int findPowerOfP(int n, int p) {
        int count = 0;
        int r = p;
        while (r <= n) {
            count += (n / r);
            r = r * p;
        }
        return count;
    }
    static Vector<pair> primeFactorsofK(int k) {
        Vector<pair> ans = new Vector<pair>();
        for (int i = 2; k != 1; i++) {
            if (k % i == 0) {
                int count = 0;
                while (k % i == 0) {
                    k = k / i;
                    count++;
                }
                ans.add(new pair(i, count));
            }
        }
        return ans;
    }
    static int largestPowerOfK(int n, int k) {
        Vector<pair> vec = new Vector<pair>();
        vec = primeFactorsofK(k);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < vec.size(); i++){
            ans = Math.min(ans, findPowerOfP(n,
                    vec.get(i).first) / vec.get(i).second);
        }
        return ans;
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
