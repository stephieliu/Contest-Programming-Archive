/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theceellsell;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class TheCeellSell {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static double round(double value, int places) {
        if (places < 0){
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public static void main(String[] args) throws IOException {
        int daytime = readInt(), evening = readInt(), weekend = readInt();
        double planA = 0, planB = 0;
        //plan A:
        if(daytime>=100){
            planA = 0.25*(daytime - 100)+0.15*evening+0.2*weekend;
        }
        else{
            planA = 0.15*evening+0.2*weekend;
        }
        planA = round(planA, 2);
        System.out.println("Plan A costs "+planA);
        //plan B:
        if(daytime>=250){
            planB = 0.45*(daytime - 250)+0.35*evening+0.25*weekend;
        }
        else{
            planB = 0.35*evening + 0.25*weekend;
        }
        planB = round(planB, 2);
        System.out.println("Plan B costs "+planB);
        if(planB==planA){
            System.out.println("Plan A and B are the same price.");
        }
        else if(planB>planA){
            System.out.println("Plan A is cheapest.");
        }
        else{
            System.out.println("Plan B is cheapest.");
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
