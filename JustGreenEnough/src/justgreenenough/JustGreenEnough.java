/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justgreenenough;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class JustGreenEnough {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), a[][] = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                a[i][j] = readInt();
            }
        }
        System.out.println(countSubGrids(n, a, 100) - countSubGrids(n, a, 101));
    }
    static int countSubGrids(int n, int a[][], int min){
        int psa[][] = new int[n+1][n+1], ans = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(a[i][j] < min) psa[i][j] = 1;
                psa[i][j] += psa[i-1][j] + psa[i][j-1] - psa[i-1][j-1];
            }
        }
        for(int r1 = 1; r1 <=n; r1++){
            for(int c1 = 1; c1<=n; c1++){
                for(int r2 = r1; r2 <=n; r2++){
                    for(int c2 = c1; c2<=n; c2++)
                        if(psa[r1][c2] - psa[r1-1][c2] - psa[r2][c1-1] + psa[r1-1][c1-1] == 0) ans++;
                }
            }
        }
        return ans;
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
