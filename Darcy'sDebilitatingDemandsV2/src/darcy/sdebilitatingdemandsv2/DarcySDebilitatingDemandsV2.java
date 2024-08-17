/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darcy.sdebilitatingdemandsv2;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class DarcySDebilitatingDemandsV2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int T = readInt(); T>0; T--){
            long n = readLong(), a = readLong(), b = readLong(), c = readLong();
            if(a+b+c<n){
                System.out.println(-1);
            }
            else{
                if(c>=n) System.out.println(0+" "+ 0+" "+n);
                else if(b+c>=n) System.out.println(0+" "+(n-c)+" "+c);
                else System.out.println((n-b-c)+" "+b+" "+c);
            }
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
