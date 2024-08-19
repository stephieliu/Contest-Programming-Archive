/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsum;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MaxSum {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt(), min = Integer.MAX_VALUE, count = 0;
        long sum = 0;
        for(int i = 0; i < n; i++){
            int x = readInt();
            sum += Math.abs(x);
            if(x < 0){
                count++;//increment the number of odd values
            }
            min = Math.min(min, Math.abs(x));//smallest value that could be subtracted
        }
        if(count % 2 == 0){//if the negative numbers = even, they can all flip signs.
            System.out.println(sum);
        }
        else{//if count is odd, they can't all flip signs. Choose the smallest negative value to subtract.
            System.out.println(sum - 2 * min);
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
