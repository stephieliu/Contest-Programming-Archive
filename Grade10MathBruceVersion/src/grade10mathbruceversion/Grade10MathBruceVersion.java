/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade10mathbruceversion;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Grade10MathBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int a = readInt(), b = readInt();
        List<Integer> factor = new ArrayList<>();
        List<Integer> freq = new ArrayList();
        for(int i = 2, limit = (int)Math.sqrt(a); i<=limit; i++){
            int count = 0;
            while(a%i ==0){
                a/=i; count++;
            }
            if(count > 0){
                factor.add(i);
                freq.add(count);
            }
        }
        if(a!=1){
            factor.add(a);
            freq.add(1);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<factor.size(); i++){
            int f = factor.get(i), count = freq.get(i), total = 0, curr = f;
            while(b>=curr){
                total+=b/curr; 
                curr *=f;
            }
            ans = Math.min(ans, total/count);
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
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
