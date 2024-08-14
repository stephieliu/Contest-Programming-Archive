/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.scards;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSCards {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [] arr = new int[N];
        //read from 1 to N
        int curr = 1, count = 0;//count counts the number removed
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
            if(arr[i] != curr){
                count++;
            }
            else curr++;
        }
        if(count == N) System.out.println(-1);
        else System.out.println(count);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }    
}
