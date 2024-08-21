/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor.salgorithm;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class VictorSAlgorithm {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [] sequence = new int[N];
        int max = 0, sum = 0;
        for(int i = 0; i<N; i++){
            sequence[i] = readInt();
            if(i>0 && sequence[i]>sequence[max]) max = i;
        }
        //make non-decreasing:
        for(int i = 0; i<max; i++){
            int temp = Math.abs(Math.max(0, sequence[i]-sequence[i+1]));
            sum+=temp;
            sequence[i+1]+=temp;
            System.out.println(sum);
        }
        //make non-increasing:
        for(int i = max; i<N-1; i++){
            int temp = Math.abs(Math.max(0, sequence[i+1]-sequence[i]));
            sum+=temp;
            sequence[i] += temp;
            System.out.println(sum);
        }
        System.out.println(Arrays.toString(sequence));
        System.out.println(sum);
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
