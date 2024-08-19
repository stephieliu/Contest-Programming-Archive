/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moobuzz;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MooBuzz {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        //way 1:
//        int n = readInt();long lo = 1, hi = (long)1e12;
//        long ans = 0;
//        while(lo<=hi){
//            long mid = (lo+hi)/2;
//            if(count(mid)>=n){
//                ans = mid;
//                hi = mid-1;
//            }
//            else{
//                lo = mid+1;
//            } 
//        }
//        System.out.println(ans);
//    }
//        way 2:
        int n = readInt(), a[] = {1,2,4,7,8,11,13,14};
        long ans = n/8 * 15;
        if(n%8 != 0) ans += a[n%8 - 1];
        if(ans%15 == 0) ans--;
        System.out.println(ans);
                
    }
//    static long count(long x){
//        return x - x/3 - x/5 + x/15;
//    }
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
