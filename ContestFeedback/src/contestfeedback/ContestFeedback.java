/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contestfeedback;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ContestFeedback {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        double A = readInt();
        double B = readInt();
        double C = readInt();
        double D = readInt();
        double avg12 = (A+B)/2;
        double avg13 = (A+C)/2;
        double avg14 = (A+D)/2;
        double avg23 = (B+C)/2;
        double avg24 = (B+D)/2;
        double avg34 = (C+D)/2;
        double avg123 = (A+B+C)/3;
        double avg124 = (A+B+D)/3;
        double avg134 = (A+C+D)/3;
        double avg234 = (B+C+D)/3;
        double avgall = (A+B+C+D)/4;
        System.out.printf("%.6f",avg12);
        System.out.println();
        System.out.printf("%.6f",avg13);
        System.out.println();
        System.out.printf("%.6f",avg14);
        System.out.println();
        System.out.printf("%.6f",avg23);
        System.out.println();
        System.out.printf("%.6f",avg24);
        System.out.println();
        System.out.printf("%.6f",avg34);
        System.out.println();
        System.out.printf("%.6f",avg123);
        System.out.println();
        System.out.printf("%.6f",avg124);
        System.out.println();
        System.out.printf("%.6f",avg134);
        System.out.println();
        System.out.printf("%.6f",avg234);
        System.out.println();
        System.out.printf("%.6f",avgall);
        System.out.println();
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
