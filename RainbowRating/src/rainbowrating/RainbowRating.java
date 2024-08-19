/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowrating;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class RainbowRating {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int i = 0; i<N; i++){
            int x = readInt();
            if(x<1000){
                System.out.println("Newbie");
            }
            else if(x>=1000&&x<=1199){
                System.out.println("Amateur");
            }
            else if(x>=1200&&x<=1499){
                System.out.println("Expert");
            }
            else if(x>=1500&&x<=1799){
                System.out.println("Candidate Master");
            }
            else if(x>=1800&&x<=2199){
                System.out.println("Master");
            }
            else if(x>=2200&&x<=2999){
                System.out.println("Grandmaster");
            }
            else if(x>=3000&&x<=3999){
                System.out.println("Target");
            }
            else{
                System.out.println("Rainbow Master");
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
