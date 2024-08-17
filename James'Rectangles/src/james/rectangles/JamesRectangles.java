/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.rectangles;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class JamesRectangles {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
//        Map<Integer, Integer> points = new HashMap<>();
//        for(int i = 0; i<N; i++){
//            for(int j = 0; j<2; j++){
//                points.put(readInt(), readInt());
//            }
//        }
        int[][] coordinates = new int[N][2];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                coordinates[i][j] = readInt();
            }
        }
        int D = (int)(Math.pow(N, 2) - N)/2;
        double [] distances = new double[D];
        for(int i = 0; i<N; i++){
            distances[i] = Math.sqrt(Math.pow(coordinates[i][0] 
                    - coordinates[i+1][0],2) 
                    + Math.pow(coordinates[i][1] 
                            - coordinates[i+1][1],2));
            
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
