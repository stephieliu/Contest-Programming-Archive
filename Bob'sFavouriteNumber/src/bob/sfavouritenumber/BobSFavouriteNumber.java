/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sfavouritenumber;

/**
 *
 * @author steph
 */
import java.io.*;
import java.util.*;
public class BobSFavouriteNumber {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] arr = new int[N+1];
        //int[] tracker = new int[N+1];
        int start = 1, count = 0;
        while(start<=N){
            for(int i = 1; i<=N+1; i++){
                if(i%2 != 0 && i%start == 0){
                    arr[i]++;
                }
            }
            start++;
        }
        for(int i = 1; i<N+1; i++){
            if(arr[i]%2 == 0 && i%2 == 1){
                count++;
            }
        }
//        int count = 0;
//        for(int i = 1; i<N+1; i++){
//            for(int j = 1; j<=(N+1); j++){
//                if(i%2 != 0 && i%j == 0){
//                    arr[i]++;
//                }
//            }
//            if(arr[i]%2 == 0 && arr[i]>0){
//                count++;
//            }
//        }
//        tracker[0] = 0;
//        for(int i = 1; i<N+1; i++){
//            tracker[i] = tracker[i-1];
//            if(arr[i] > 0 && arr[i]%2 == 0){
//                tracker[i]++;
//            }
//        }
        //System.out.println(tracker[N]);
        System.out.println(count);
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
