/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hydrocarbons;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Hydrocarbons {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int a = readInt(), b = readInt(), c = readInt(), d = readInt();
        int cc = a+b+c+1, hc = d;
        if(b==0 && a<c-1){
            System.out.println("invalid");
            System.exit(0);
        }
        if(b!=0 && a<c){
            System.out.println("invalid");
            System.exit(0);
        }
        int bs = 2*a+4*b+6*c, rhb = 4*cc-bs;
        if(rhb != d){
            System.out.println("invalid");
        }
        else System.out.println("C"+cc+"H"+hc);
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
