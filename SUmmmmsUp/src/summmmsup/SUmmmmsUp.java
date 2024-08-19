/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summmmsup;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SUmmmmsUp {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), K = readInt(), count = 0;
        int[] A = new int [N];
        for(int i = 0; i<N; i++){
            A[i] = readInt();
        }
        Arrays.sort(A);
        if(A[N-1]>=K) System.out.println(1);
        else{
            int sum = 0;
            for(int i = N-1; i>=0; i--){
                if(sum<K) {
                    sum += A[i];
                    count++;
                }
                else break;
            }
            if(count==0) System.out.println(-1);
            else System.out.println(count);
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
