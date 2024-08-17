/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countthetriplets;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CountTheTriplets {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int []a = new int [n];
        Set<Integer> set = new HashSet();
        for(int i = 0; i<n; i++){
            a[i] = readInt();
            set.add(a[i]);
        }
        Arrays.sort(a);
        long count = 0;
        for(int i = 0; i<n; i++){
            if(i>0 && a[i]== a[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j>i+1 && a[j]==a[j-1]) continue;
                if(set.contains(a[i]+a[j])) count++;

            }
        }
        System.out.println(count==0? -1: count);
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
