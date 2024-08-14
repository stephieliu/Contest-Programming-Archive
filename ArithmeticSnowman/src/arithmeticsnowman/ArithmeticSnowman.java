/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticsnowman;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class ArithmeticSnowman {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String [] args) throws IOException{
        int n = readInt(), a[] = new int[n], cnt[] = new int[100001], ans = 0;
        for(int i=0; i<n; i++){
            a[i] = readInt(); cnt[a[i]]++;
	}
	Arrays.sort(a);
	for(int i=n-1; i>=0; i--){
            if(cnt[a[i]] >= 3) 
                ans = Math.max(ans, 3*a[i]);
            for(int j=i-1; j>=0; j--){
		if(a[i] == a[j]) 
                    continue;
		int third = a[j] - (a[i] - a[j]);
		if(third>=0 && cnt[third] > 0) { 
                    ans = Math.max(ans, 3*a[j]); 
                    break;
                }
            }
	}
	System.out.println(ans);
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
    static String readLine () throws IOException {
	return br.readLine().trim();
    }
}
