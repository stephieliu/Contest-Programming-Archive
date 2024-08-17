/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epidemiology;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int P = readInt();// number to be compared with
        double N = readDouble();//number of people infected on the first day
        int R = readInt();// number to be multiplied each time
        int day = 0;
        int sum = 0;
        if((double)P>N && N>0){
            while(sum<P){
                N = N*R;
                sum+=N;
                day++;
            }
            System.out.println(day);
        }
        else{
            System.out.println(0);
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