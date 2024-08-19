/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perket;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Perket {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();//number of ingredients
        int[][] ingredients = new int [N][2];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                ingredients[i][j] = readInt();
            }
        }
        //long [][] combinations = new long [(int)Math.pow(2,N)-1][2];
        //ingredients[x][0] = sourness, ingredients[x][1] = bitterness
        long diff = Long.MAX_VALUE;
        for(int i = 0; i<N; i++){
            long s = 1, b = 0;
            for(int j = 0; j<N; j++){
                if(j<=i){
                    s*=ingredients[j][0];
                    b+=ingredients[j][1];
                }
            }
            long d = (s>b?s-b:b-s);
            if(d<diff){
                diff = d;
            }
        }
        System.out.println(diff);
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
