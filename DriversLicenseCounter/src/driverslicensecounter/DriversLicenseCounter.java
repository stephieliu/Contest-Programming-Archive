/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverslicensecounter;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class DriversLicenseCounter {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int[] a1 = new int[2];
        int[] a2 = new int[2];
        int[] a3 = new int[2];
        
        for(int i = 0; i<95; i++){
            String l = readLine();
            int a = readInt();
            if(a>=6 && a<=9){
                if(l.equals("Yes")){
                    a1[0]++;
                }
                else a1[1]++;
            }
            else if(a>=10 && a<=13){
                if(l.equals("Yes")){
                    a2[0]++;
                }
                else a2[1]++;
            }
            else{
                if(l.equals("Yes")){
                    a3[0]++;
                }
                else a3[1]++;
            }
        }
        
        System.out.println(Arrays.toString(a1)+"\n"+Arrays.toString(a2)+"\n"+Arrays.toString(a3));
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
