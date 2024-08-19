/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsaanumbers;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class RSAANumbers {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static int divisors(int check){
        if(check == 1){
            return 1;
        }
        else{
            int low = 1, high = check;
            Set <Integer> unique = new HashSet<>();
            while(low<=high){
                if(check%low==0){
                    unique.add(low);
                    unique.add(high);
                }
                low ++;
                high = check/low;
            }
            return unique.size();
        }
    }
    public static void main(String[] args) throws IOException {
        int low = readInt(), high = readInt();
        int count = 0;
        for(int i = low; i<=high; i++){
            if(divisors(i)==4){
                count++;
            }
        }
        System.out.println("The number of RSA numbers between " 
                +low+" and "+high+" is "+count);
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
