/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyfencing;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class CrazyFencing {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        double area = 0;
        DecimalFormat df = new DecimalFormat("###.#");
        int[][] heights = new int[N][2];
        int[] base = new int[N];
        
        //reading input for heights, the col 0 is the left side, the col 1 is the right side
        heights[0][0] = readInt();//the first left side
        heights[0][1] = readInt();//the first right side
        for(int i = 1; i<N; i++){
            heights[i][0] = heights[i-1][1];//reads in the left side
            heights[i][1] = readInt();//reads in the next right side
        }
        //reading in the bases
        for(int i = 0; i<N; i++){
            base[i] = readInt();
        }
        //calculating the area
        for(int i = 0; i<N; i++){
            area += ((double)(heights[i][0] + heights[i][1])*base[i])/2.0;
        }
        System.out.println(df.format(area));
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
