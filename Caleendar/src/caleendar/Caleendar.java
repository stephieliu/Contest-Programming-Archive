/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caleendar;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class Caleendar {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int weekday = readInt();
        int numday = readInt();
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        if(weekday!=1){
            for(int i = 1; i<weekday; i++){
                System.out.print("    ");
            }
        }
        int count = weekday;
        for(int i = 1; i<=numday; i++){
            int length = 0;
            if(i>=10){
                length = 2;
            }
            else{
                length = 1;
            }
            if(count==8){
                System.out.print("\n");
                count = 1;
            }
            
            int spaces = 3-length;
            for(int j = 0; j<spaces; j++){
                System.out.print(" ");
            }
            System.out.print(i);
            count++;
            if(count!= 8 && i!=numday){
                System.out.print(" ");
            }
        }
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
