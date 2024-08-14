/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brotherlysequence;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BrotherlySequence {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] S = new int[N];
        int[] A = new int[N]; Arrays.fill(A, 1);
        for(int i = 0; i<N; i++){
            S[i] = readInt();
        }
        for(int i = 1; i<N; i++){
            if(S[i]>=1 && S[i]<N){
                if(Math.abs(S[i]-S[i-1])<=2){
                    A[i-1]++;
                    A[i] = A[i-1];
                }
            } 
       }
        Arrays.sort(A);
        System.out.println(A[A.length-1]);
//        int index = -1;
//        for(int i = 1; i<N-1; i++){
//            if((Math.abs(S[i-1]-S[i])<=2) && (Math.abs(S[i]-S[i+1])>=2)){
//                if(index!=-1){
//                    index++;
//                }
//            }
//        }
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
