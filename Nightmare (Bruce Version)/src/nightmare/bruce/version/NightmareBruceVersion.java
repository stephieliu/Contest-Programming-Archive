/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightmare.bruce.version;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class NightmareBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt();
        int a[] = new int[n+1];
        int [] pmax = new int[n+2];
        int []pcount = new int[n+2];
        for(int i = 1; i<=n; i++){
            a[i] = readInt();
            if(pmax[i-1] < a[i]){
                pmax[i] = a[i];
                pcount[i] = 1;
            }
            else if(pmax[i-1]>a[i]){
                pmax[i] = pmax[i-1];
                pcount[i] = pcount[i-1];
            }
            else{
                pmax[i] = pmax[i-1];
                pcount[i]= pcount[i-1]+1;
            }
        }
        int [] smax = new int[n+2];
        int[] scount = new int[n+2];
        for(int i = n; i>=1; i--){
            if(smax[i+1]<a[i]){
                smax[i] = a[i];
                scount[i] = 1;
            }
            else if(smax[i+1]>a[i]){
                smax[i] = smax[i+1];
                scount[i] = scount[i+1];
            }
            else{
                smax[i] = smax[i+1];
                scount[i] = scount[i+1]+1;
            }
        }
        for(int i = 1; i<=q; i++){
            int x = readInt(), y = readInt();
            int lmax = pmax[x-1], lcount = pcount[x-1];
            int rmax = smax[y+1], rcount = scount[y+1];
            if(lmax>rmax) System.out.println(lmax+" "+lcount);
            else if(lmax<rmax) System.out.println(rmax+" "+rcount);
            else System.out.println(lmax+" "+(lcount+rcount));
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
