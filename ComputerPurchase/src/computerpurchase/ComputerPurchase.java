/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpurchase;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class ComputerPurchase {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt();
        if(n == 1){
            String comp = next();
            System.out.println(comp);
        }
        else{
            Computer [] arr = new Computer [n];
            for(int i = 0; i<n; i++){
                String name = next();
                int r = readInt();
                int S = readInt();
                int d = readInt();
                Computer x = new Computer(name, r, S, d);
                arr[i] = x;
            }
            System.out.println(Arrays.toString(arrange(arr)));
        }
    }
    public static double [] arrange(Computer [] arr){
        int l = arr.length;
        double [] a = new double [l];
        for(int i = 0; i<l; i++){
            Computer x = arr[i];
            x.VALUE = a[i];
        }
        Arrays.sort(a);
        return a;
    }
    static class Computer{
        String name;
        int RAM;
        int CPU;
        int DDS;
        double VALUE;
        Computer(String n, int r, int c, int d){
            name = n;
            RAM = r;
            CPU = c;
            DDS = d;
            VALUE = (2*r) + (3*c) + d;
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
