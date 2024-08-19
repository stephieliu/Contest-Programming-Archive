/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modernart;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ModernArt {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int M = readInt(), N = readInt(), K = readInt(), count = 0;
        boolean[][] canvas = new boolean[M][N];//false is black, gold is true
        for(int i = 0; i<K; i++){
            String choice = next();
            int index = readInt();
            if(choice.equals("R")){
                for(int j = 0; j<N; j++){
                    canvas[index-1][j] ^= false;
                }
            }
            else{
                for(int j = 0; j<M; j++){
                    canvas[j][index-1]^=false;
                }
            }
        }
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(canvas[i][j]) count++;
            }
        }
        System.out.println(count);
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
