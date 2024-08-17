/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujoneko;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class FujoNeko {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int R = readInt(), C = readInt();
        boolean [] row = new boolean[R]; boolean column[] = new boolean[C];
        for(int i = 0; i<R; i++){
            String s = readLine();
            for(int j = 0; j<C; j++){
                char c = s.charAt(j);
                if(c == 'X'){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(column));
        int Q = readInt();
        for(int i = 0; i<Q; i++){
            int x = readInt()-1, y = readInt()-1;
            if(row[y] || column[x]){
                System.out.println("Y");
            }
            else System.out.println("N");
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
