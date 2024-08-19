/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwaveebuuuuttons;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class MicrowaveeBuuuuttons {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String s[] = readLine().split(":");
        int desire = 3600 * Integer.parseInt(s[0])+60*Integer.parseInt(s[1])+Integer.parseInt(s[2]);
        String button = readLine(); boolean dig[] = new boolean[10];
        for(int i = 0; i<button.length(); i++){
            dig[button.charAt(i)-'0'] = true;
        }
        int min = Integer.MAX_VALUE;
        int hh = 0, mm = 0, ss = 0;
        for(int h =0; h<=99; h++){//h = 23   h = 8
            if(!dig[h/10] || !dig[h%10]) continue; //h/10 is the tens, h%10 is the units
            for(int m = 0; m<=99; m++){
                if(!dig[m/10] || !dig[m%10])continue;
                for(int sec = 0; sec<=99; sec++){
                    if(!dig[sec/10] || !dig[sec%10]) continue;
                    int dif = Math.abs(desire-(h*3600 + m*60 + sec));
                    if(dif<min){
                        min = dif;
                        hh = h; mm = m; ss = sec;
                    }
                }
            }
        }
        System.out.printf("%02d:%02d:%02d\n",hh,mm,ss);
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
