/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picturee.peeerfect;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class PictureePeeerfect {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int C = readInt();
        while(C!=0){
            int minDim = (int)Math.sqrt(C);
            int otherDim = C/minDim;
            if(C%minDim!=0){
                for(int i = minDim; i>0; i--){
                    if(C%i == 0){
                        minDim = i;
                        otherDim = C/minDim;
                        break;
                    }
                }
            }
            int perimeter = 2*(minDim+otherDim);
            System.out.println("Minimum perimeter is "+perimeter
                    +" with dimensions "+minDim+" x "+otherDim);
            C = readInt();
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
