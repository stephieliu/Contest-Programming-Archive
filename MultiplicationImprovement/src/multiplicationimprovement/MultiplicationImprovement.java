/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationimprovement;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
import java.math.*;
public class MultiplicationImprovement {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String S = next();
        String[] arr = S.split("x");
        BigInteger product = new BigInteger("1");
        int[] a = new int[arr.length];
        //int product = 1;
        for(int i = 0; i<arr.length; i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(a[i]+"x");
            product = product.multiply(BigInteger.valueOf(a[i]));
        }
        product = product.multiply(BigInteger.valueOf(a[arr.length-1]));
        System.out.print(a[arr.length-1]+"\n"+product+"\n");
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
