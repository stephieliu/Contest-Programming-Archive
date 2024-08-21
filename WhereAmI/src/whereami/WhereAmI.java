/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereami;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WhereAmI {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        String s = next();
        for(int i = 1; i<=N; i++){
            boolean flag = true;
            Set <String> st = new HashSet<>();
            for(int j = 0; j+i <= N; j++){
                String sub = s.substring(j, j+i);
                if(st.contains(sub)){
                    flag = false; break;
                }
                st.add(sub);
            }
            if(flag){
                System.out.println(i); break;
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
