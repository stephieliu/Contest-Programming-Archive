/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowgymnastics;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CowGymnastics {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int K = readInt(), N = readInt(), count = 0;
        int arr[][] = new int [20][30];
        boolean consistent = true;
        for(int i = 1; i<=K; i++){
            for(int j = 1; j<=N; j++){
                int x = readInt();
                arr[i][x] = j;
            }
        }
//        for(int i = 0; i<20; i++){
//            for(int j = 0; j<30; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        //System.out.println(Arrays.toString(arr));
        //Determine # of consistent pairs
        for(int i = 1; i<N; i++){
            for(int j = i+1; j<=N; j++){
                consistent = true;
                //compare each pair (small number!) to determine if 
                //the results are consistent for that specific pair
                for(int r = 1; r<=K; r++){
                    if(arr[r][i]>arr[r][j]) consistent = false;
                }
                if(consistent) count++;
                consistent = true;
                for(int r = 1; r<=K; r++){
                    if(arr[r][i]<arr[r][j]) consistent = false;
                }
                if(consistent) count++;
            }
        }
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
