/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whohasseenthewind;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class WhoHasSeenTheWind {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int h = readInt(), M = readInt(), A = 0, t = 1;
        boolean land = false;
        
        for(t = 1; t<M; t++){
            A = (-6)*((int)Math.pow(t, 4))+h*((int)Math.pow(t,3))
                    +2*((int)Math.pow(t, 2))+t;
            if(A<=0){
                land = true;
                break;
            }
        }
        if(land == true){
            System.out.println("The balloon first touches "
                    + "ground at hour:\n"+t);
        }
        else{
            System.out.println("The balloon does not touch"
                    + " ground in the given time.");
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
