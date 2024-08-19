/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notenoughtesters;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class NotEnoughTesters {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int [] fact = new int [1001];
        List <Integer> list [] = new ArrayList[1001];
        for(int i = 0; i< list.length; i++){
            list[i] = new ArrayList();
        }
        for(int i = 1; i<=1000; i++){
            for(int j = i; j<=1000; j+=i){
                fact[j]++;
            }
            list[fact[i]].add(i);
        }
        int T = readInt();
        for(int i = 1; i<=T; i++){
            int k = readInt(), a = readInt(), b = readInt();
            int pa = Collections.binarySearch(list[k], a);
            if(pa<0){
                pa = -pa -1;
            }
            int pb = Collections.binarySearch(list[k], b);
            if(pb<0) pb = -pb-2;
            System.out.println(pb-pa+1);
        }
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
}
