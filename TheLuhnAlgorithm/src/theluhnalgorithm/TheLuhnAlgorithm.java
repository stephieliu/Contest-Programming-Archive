/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theluhnalgorithm;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TheLuhnAlgorithm {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                String s = next();
                for(int x = 0; x<10; x++){
                    if(valid(s+String.valueOf(x))){
                        System.out.print(x);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
    static boolean valid(String s){
        //step 1:
        //s = s.trim();
        int t = 0;
        for(int i = s.length()-2; i>-1; i-= 2){
            int x = Integer.parseInt(s.substring(i, i+1))*2, sum = 0;
            String dbl = String.valueOf(x);
            if(dbl.length()==2){
                sum = Integer.parseInt(dbl.substring(0,1))+Integer.parseInt(dbl.substring(1));
            }
            else if(dbl.length()==1){
                sum = Integer.parseInt(dbl.substring(0));
            }
            t+=sum;
        }
        for(int i = s.length()-1; i>-1; i-=2){
            t+=Integer.parseInt(s.substring(i, i+1));
        }
        if(t%10 == 0){
            return true;
        }
        return false;
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
