/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeshirts;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class FreeShirts {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int ccc = 0; ccc<10; ccc++){
            int N = readInt(), M = readInt(), D = readInt();
            List<Integer> a = new ArrayList<>();
            int days[] = new int[D], lc = 0;
            for(int i = 0; i<M; i++){
                int in = readInt();
                a.add(in);
                days[in-1]++;
            }
            days[0] = N;
            for(int i = 1; i<D; i++){
                days[i] += days[i-1];
                if(days[i]>0){
                    days[i]--;
                }
                else if (days[i] == 0){
                    lc++;
                }
//                if(days[i-1]-1>=0){
//                    days[i] += days[i-1]-1;
//                }
//                else if(days[i]>0 && days[i-1]-1<0){
//                    days[i] --;
//                }
//                else if(days[i-1]-1<0){
//                    days[i] = 0;
//                }
//                if(days[i] == 0) lc++;
//                System.out.println(Arrays.toString(days));
            }
            System.out.println(Arrays.toString(days));
            System.out.println(lc);
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
