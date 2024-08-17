/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipperredux;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class FlipperRedux {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), arr[][] = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                arr[i][j] = readInt();
            }
        }
        for(int i = 0; i<N; i++){
            if(arr[0][i] == 1){
                for(int j= 0; j<N; j++){
                    arr[j][i]^= 0;
                }
            }
        }
        for(int i = 0; i<N; i++){
            if(arr[i][0] == 1){
                for(int j =0; j<N; j++){
                    arr[i][j]^=0;
                }
            }
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
