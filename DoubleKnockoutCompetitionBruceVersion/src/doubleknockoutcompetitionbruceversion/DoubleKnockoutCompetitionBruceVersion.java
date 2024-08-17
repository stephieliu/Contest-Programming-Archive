/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleknockoutcompetitionbruceversion;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class DoubleKnockoutCompetitionBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for(int i = 1; i<=t; i++){
            int n = readInt(), undef = n, onel = 0, elim = 0, round = 0;
            while(true){
                System.out.println("Round "+round+": "+undef+" undefeated, "+onel+" one-loss, "+elim+" eliminated");
                if(undef == 0 && onel == 1) break;
                if(undef == 1 && onel == 1){
                    undef = 0; onel = 2;
                }
                else{
                    elim += onel/2;
                    onel = onel-onel/2 + undef/2;
                    undef -=undef/2;
                }
                round++;
            }
            System.out.println("There are "+round+" rounds.");
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
