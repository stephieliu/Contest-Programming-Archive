/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nastynumbers;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class NastyNumbers {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int size = readInt();
        for(int i= 0; i<size; i++){
            int x = readInt(); boolean nasty = false;
            Set <Integer> sum =new HashSet(), diff = new HashSet();
            for(int j =1; j<=Math.sqrt(x); j++){
                if(x%j == 0){
                    int factor = x/j;
                    if(sum.contains(factor-j)||diff.contains(factor+j)){
                        nasty = true; break;
                    }
                    sum.add(factor+j); diff.add(factor-j);
                }
            }
            if(nasty==true){
                System.out.println(x+" is nasty");
            }
            else{
                System.out.println(x+" is not nasty");
            }
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
