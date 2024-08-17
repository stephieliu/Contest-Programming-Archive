/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darcy.sdebilitatingdemands;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DarcySDebilitatingDemands {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int x = 0; x<T; x++){
            long N = readLong(), A = readLong(), B = readLong(), C = readLong();
            long[] arr = {A, B, C};
            Arrays.sort(arr);
            boolean found = false;
            long a = 0, b=0, c=0;
            for(long i = 0; i<=arr[2]; i++){
                for(long j = 0; j<=arr[1]; j++){
                    for(long k = 0; k<=arr[0]; k++){
                        if(i+j+k == N){
                            found = true;
                            a = i;
                            b = j;
                            c = k;
                            break;
                        }
                    }
                    if(found) break;
                }
                if(found) break;
            }
            if(found) System.out.println(a+" "+b+" "+c);
            else System.out.println("-1");
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
