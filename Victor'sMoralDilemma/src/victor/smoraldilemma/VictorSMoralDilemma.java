/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor.smoraldilemma;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class VictorSMoralDilemma {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt(), d = readInt();
        long people[] = new long[n];
        List<Long>psa= new ArrayList<>();
        people[0] = readLong(); psa.add(0, people[0]);
        for(int i = 1; i<n; i++){
            people[i] = readLong();
            psa.add(i, psa.get(i-1)+people[i]);
        }
        int A = 0, B = 0;
        for(int i = 0; i<d; i++){
            int ni = readInt();
            long F = psa.get(ni-1+A);
            long S = psa.get(psa.size()-1-B)-F;
            if(A>0) F = psa.get(ni-1+A) - psa.get(ni-2+A);
            if(F>=S){
                System.out.println(F);
                A+=ni;
            }
            else{
                System.out.println(S);
                B += ni;
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
