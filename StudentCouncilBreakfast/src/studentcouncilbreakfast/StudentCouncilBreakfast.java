/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcouncilbreakfast;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class StudentCouncilBreakfast {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int pink = readInt(), green = readInt(), red = readInt(), orange = readInt();
        int total = readInt(), count = 0;
        int min = Integer.MAX_VALUE;
        for(int p = 0; p <= total/pink; p++){
            for(int g = 0; g<= total/green; g++){
                for(int r = 0; r<=total/red; r++){
                    for(int o = 0; o<=total/orange; o++){
                        if(p*pink+g*green+r*red+o*orange == total && p+g+o+r>0){
                            System.out.println("# of PINK is "+p+" # of GREEN is "
                            +g+" # of RED is "+r+" # of ORANGE is "+o);
                            count++;
                            if(min>p+g+r+o) min = p+g+r+o;
                        }
                        
                    }
                }
            }
        }
        System.out.println("Total combinations is "+count+".\nMinimum number of "
                + "tickets to print is "+min+".");
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
