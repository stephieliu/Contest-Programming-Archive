/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrackingnqueens1;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class BacktrackingNQueens1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), ans = 0;
        boolean row[] = new boolean[n], col[] = new boolean[n], lft[] = new boolean[2*n-1], rit[] = new boolean[2*n-1];
        for(int i =1; i<=m; i++){
            int r = readInt()-1, c = readInt()-1;
            row[r] = col[c] = lft[r+c] = rit[r+n-1-c] = true;
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(!row[i]&&!col[j] && !lft[i+j] && !rit[i+n-1-j]) ans++;
            }
        }
        System.out.println(ans);
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
