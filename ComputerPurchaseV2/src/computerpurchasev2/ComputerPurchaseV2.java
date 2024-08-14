/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpurchasev2;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class ComputerPurchaseV2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n, r, s, d, total;
	String brand;
	int bestvalue1, bestvalue2;
	String best1, best2;
	n = readInt();
	if(n > 0){
	    brand = next();
	    r = readInt();
	    s = readInt();
	    d = readInt();
	    total = 2 * r + 3 * s + d;
	    bestvalue1 = total;
	    best1 = brand;
	    best2 = "";
	    bestvalue2 = 0;
	    for(int i = 1 ; i < n ; i++){
		brand = next();
		r = readInt();
		s = readInt();
		d = readInt();
		total = 2 * r + 3 * s + d;
		if((total > bestvalue1) || (total == bestvalue1 
                        && brand.compareTo (best1) < 0)){
		    bestvalue2 = bestvalue1;
		    best2 = best1;
		    bestvalue1 = total;
		    best1 = brand;
		}
		else if((total > bestvalue2) || (total == bestvalue2 
                        && brand.compareTo (best2) < 0)){
		    bestvalue2 = total;
		    best2 = brand;
		}
	    }
	    if(n == 1){
		System.out.println(best1);
            }
	    else{
		System.out.println(best1);
		System.out.println(best2);
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
