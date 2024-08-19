/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterngeneratorv2;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class PatternGeneratorV2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
	int rand = readInt();
	for(int j = 0 ; j < rand ; j++){
	    int n = readInt();
	    int k = readInt();
	    String s = "";
            int i = 0;
	    for(i = 0; i < k ; i++){
		s += "1";
            }
	    for(; i < n ; i++){
		s += "0";
            }
	    int x = s.lastIndexOf("10");
	    System.out.println("The bit patterns are ");
	    while(x >= 0)
	    {
		System.out.println(s);
		StringBuilder sb = new StringBuilder (s.substring(x + 2));
		s = s.substring(0, x) + "01" + sb.reverse();
		x = s.lastIndexOf("10");
	    }
	    System.out.println(s);
	    System.out.println();
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