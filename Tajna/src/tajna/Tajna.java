/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tajna;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class Tajna {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String s = next();
        int[] arr = smallestFactors(s.length());
        char [][] matrix = new char[arr[0]][arr[1]];
//        for(int i = 0; i<arr[0]; i++){
//            for(int j = 0; j<arr[1]; j++){
//                System.out.print(0);
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.toString(arr));
        int c = 0;
        for(int i = 0; i<arr[1]; i++){
            for(int j = 0; j<arr[0]; j++){
                matrix[j][i] = s.charAt(c);
                c++;
            }
        }
        for(int i = 0; i<arr[0]; i++){
            for(int j = 0; j<arr[1]; j++){
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println();
    }
    static int[] smallestFactors(int num){
        int incrementer = num % 2 == 0 ? 1 : 2;
        int max = Integer.MIN_VALUE, factor = 0;
        int [] arr = new int[2];
        for (int i = 1; i <= Math.sqrt(num); i += incrementer) {
            if (num % i == 0 && i>max) {
                max = i;
                factor = num/i;
            }
        }
        arr[0] = max; arr[1] = factor;
        return arr;
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
