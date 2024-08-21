/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problemb;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TSSClubFair2017ProblemB {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), Q = readInt();
        int[] houses = new int[N];
        for(int i = 0; i<N; i++){
            int x = readInt(), y = readInt();
            int distance = (int)Math.ceil(Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0, 2)));
            houses[i] = distance;
        }
        Arrays.sort(houses);
        //System.out.println(Arrays.toString(houses));
        for(int i = 0; i<Q; i++){
            int r = readInt(), count = 0, left = 0, right = N-1;
            while(left<=right){
                int mid = (right+left)/2;
                if(houses[mid]<=r){
                    count = mid+1; left = mid+1;
                }
                else right = mid-1;
            }
            System.out.println(count);
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
