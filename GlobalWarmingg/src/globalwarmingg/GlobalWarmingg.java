/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalwarmingg;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class GlobalWarmingg {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        while(true){
            int N = readInt();
            if(N==0)break;
            int a[] = new int[N];
            for(int i = 0; i<N; i++){
                a[i] = readInt();
            }
            int diff[] = new int [a.length-1];
            for(int i = 0; i<diff.length; i++){
                diff[i]= a[i+1]-a[i];
            }
    //        System.out.println(Arrays.toString(diff));
            int cycle = 0;
            for(cycle = 1; cycle < diff.length; cycle++){
                boolean flag = true;
                for(int i = 0; i<diff.length; i++){
                    if(diff[i]!=diff[i%cycle]){
                        flag = false;
                    }
                }
                if(flag){
                    break;
                }
            }
            System.out.println(N==1? 0: cycle);//this is like this:
            //condition? true: false
            //it's like an if statement. If true, do the true case. otherwise
            //do the false case
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
