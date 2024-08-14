/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotherrsortingg;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AnotherrSortingg {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Integer arr[] = new Integer[N];
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr, new comp());
        for(int i = 0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static class comp implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            int a1 = a%10;
            int b1 = b%10;
            if(a1!=b1){
                return a1 - b1;
            }
            else return b-a;
        }
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
