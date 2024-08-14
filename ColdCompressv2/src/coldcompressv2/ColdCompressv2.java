/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldcompressv2;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class ColdCompressv2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int i = 0; i<N; i++){
            String chars = next();
            char y = chars.charAt(0);
            int toprint = 1;
            for(int j = 1; j<chars.length(); j++){
                if(y==chars.charAt(j)){
                    toprint++;
                }
                else{
                    System.out.print(toprint+" "+y+" ");
                    y = chars.charAt(j);
                    toprint = 1;
                }
            }
            System.out.print(toprint+" "+y+"\n");
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
