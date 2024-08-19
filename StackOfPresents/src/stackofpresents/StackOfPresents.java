/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofpresents;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class StackOfPresents {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [] arr = new int [N];
        Stack <Integer> stack = new Stack();
        for(int i = 0; i<N; i++){
            arr[i] = readInt();
        }
        Arrays.sort(arr);
        int weight = arr[0];
        stack.push(arr[0]);
        for(int i = 1; i<N; i++){
            int x = arr[i];
            if(weight<=x){
                stack.push(x);
                weight+=x;
            }
        }
        System.out.println(stack.size());
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
