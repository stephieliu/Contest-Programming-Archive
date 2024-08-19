/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obilazak;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Obilazak {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int K;
    static int [] tree;
    static int [] route;
    public static void main(String[] args) throws IOException {
        K = readInt();
        Map<Integer, Integer> visit = new HashMap<>();
        tree = new int[K];
        for(int i= 0; i<K; i++){
            tree[i] = readInt();
            visit.put(i, readInt());
        }
        for(int i = 0; i<K; i++){
            if(i<Math.pow(2, K-1)){
                visit.put(i, 2*i);   
            }
            
            if(i<Math.pow(2, K-1)){
                visit.put(i, 2*i+1);
                System.out.println(visit.get(i)+visit.get(K));
            }
        }
        //use a function to help fill in visit and find the next value for
        //temp
        //also fill in the tree and route arrays
        //reverse recursive function:
        for(int i = 0; i<K; i++){
            int temp = visit.get(i);
            System.out.println(reverse(temp));
        }
    }
    static int reverse(int x){
        int p = 1; //counter
        if(x<Math.pow(2, K-1)){
            return(2*x);            
        }
        tree[x] = route[p];
        p++;
        if(x< Math.pow(2, K-1)){
            return (2*x+1);
        }
        return (x);
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
