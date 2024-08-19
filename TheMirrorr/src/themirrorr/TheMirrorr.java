/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themirrorr;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class TheMirrorr {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int q = 0; q<N; q++){
            int n1 = readInt(), n2 = readInt(), count = 0;
            while(n1 < n2){
                if(n2 <= 1){
                    System.out.print("0");
                    break;
                }
                else{
                    int factorCheck1 = 2;
                    boolean isPrime1 = true;
                    while (factorCheck1 < n1){
                        if(n1 % factorCheck1 == 0){
                            isPrime1 = false;
                        }
                        factorCheck1++;
                    }
                    if (isPrime1&&n1!=1){
                        count++;
                    }
                    n1++;
                }
            }
            System.out.println(count);
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
