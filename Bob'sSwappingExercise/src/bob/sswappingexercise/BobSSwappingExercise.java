/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sswappingexercise;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSSwappingExercise {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt(), P []= new int[N], arr[] = new int[N], S[][] = new int[M][2];
        for(int i = 1; i<=N; i++){
            P[i-1] = i;
            arr[i-1] = i;
        }
        int count = 1;
        for(int i = 0; i<M; i++){
            S[i][0] = readInt();
            S[i][1] = readInt();
            swap(P, S[i][0]-1, S[i][1]-1);
        }
        boolean flag = true;
//        System.out.println(Arrays.toString(arr));
        while(!Arrays.equals(arr, P)){
            for (int i = 0; i < M; i++) {
                swap(P, S[i][0] - 1, S[i][1] - 1);
            }
            count++;
            if(count>1000000){
                System.out.println(-1);
                flag = false;
                break;
            }
        }
        
        if(flag) System.out.println(count);
    }
    public static void swap(int[] arr, int i, int j) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
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
