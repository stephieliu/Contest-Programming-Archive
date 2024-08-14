/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alicethroughthelookingglass;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AliceThroughTheLookingGlass {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int k = 0; k < T; k++){
            double m = readDouble(), x = readDouble(), y = readDouble();
            if(containsCrystal(m, x, y, 0, 0)) System.out.println("crystal");
            else System.out.println("empty");
        }
    }
    static boolean containsCrystal(double m, double x, double y, double a, double b){
        if(m == 0) return false;
        
        if(2*Math.pow(5, m-1)+a <= x){
            if(x < a+3*Math.pow(5, m-1)){
                if(y < b+2*Math.pow(5, m-1)){
                    if(Math.pow(5, m-1)+b <= y) return true;
                }
            }
        }
        
        if(Math.pow(5, m-1)+a <= x){
            if(x < a+4*Math.pow(5, m-1)){
                if(y < b+Math.pow(5, m-1)) return true;
            }
        }

        if(containsCrystal(m-1, x, y, a+3*Math.pow(5, m-1), b+3*Math.pow(5, m-1))) return true;
        
        if(containsCrystal(m-1, x, y, a+Math.pow(5, m-1), b+Math.pow(5, m-1))) return true;
        
        if(containsCrystal(m-1, x, y, a+2*Math.pow(5, m-1), b+2*Math.pow(5, m-1))) return true;
        
        
        return false;
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
