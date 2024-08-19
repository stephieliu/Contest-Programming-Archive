/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TowerOfHanoi {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        hanoi(8, 'A', 'B', 'C');
        int a[] = {1,2,3};
        List<Integer> com = new ArrayList();
        getCombination(a, 0, com);
    }
    static void getCombination(int[]a, int idx, List<Integer> com){
        if(idx == a.length){
            System.out.print("[");
            for(int x:com) System.out.print(x+" ");
            System.out.println("]"); return;
        }
        getCombination(a, idx+1, com);
        com.add(a[idx]); getCombination(a, idx+1, com); com.remove(com.size()-1);
    }
    static void hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println(A + "-->" + C);
        } else {
            hanoi(n - 1, A, C, B);
            System.out.println(A + "-->" + C);
            hanoi(n - 1, B, A, C);
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
