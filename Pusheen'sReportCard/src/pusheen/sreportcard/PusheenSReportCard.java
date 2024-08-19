/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pusheen.sreportcard;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class PusheenSReportCard {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
//        DecimalFormat df = new DecimalFormat("#.####");
//        df.setRoundingMode(RoundingMode.CEILING);
        int N = readInt();
        double avg = 0.0;
        int sum = 0;
        for(int i = 0; i<N; i++){
            int ai = readInt();
            sum+=ai;
        }
        avg = (double)sum/(double)N;
        System.out.printf("%.1f", avg);
        System.out.print("\n");
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
