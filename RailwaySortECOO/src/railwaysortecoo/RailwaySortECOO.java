/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwaysortecoo;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class RailwaySortECOO {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int t = 1; t<=10; t++){
            int n = readInt(); List<Integer> train = new ArrayList();
            for(int i = 0; i<n; i++){
                train.add(readInt());
            }
            int cost = 0;
            for(int i = n-1; i>=1; i--){
                int cur = train.indexOf(i);
                int nxt = train.indexOf(i+1);
                if(cur>nxt){
                    cost+=cur;
                    train.remove(cur);
                    train.add(0,i);
                }
            }
            System.out.println(cost);
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
