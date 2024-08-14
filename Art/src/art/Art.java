/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art;



/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int [][] paint = new int [N][2];
        for(int i = 0; i<N; i++){
            String coordinate = next();
            String [] coordinates = coordinate.split(",");
            for(int j = 0; j<2; j++){
                paint[i][j] = Integer.parseInt(coordinates[j]);
            }
        }
        //up to here, the program works.
        int bottomLX = Integer.MAX_VALUE;
        int bottomLY = Integer.MAX_VALUE;
        int topRX = Integer.MIN_VALUE;
        int topRY = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++){
            if(paint[i][0]<bottomLX){
                bottomLX = paint[i][0];
            }
            if(paint[i][1]<bottomLY){
                bottomLY = paint[i][1];
            }
            if(paint[i][0]>topRX){
                topRX = paint[i][0];
            }
            if(paint[i][1]>topRY){
                topRY = paint[i][1];
            }
        }
        bottomLX--; bottomLY--; topRX++; topRY++;
        System.out.print(bottomLX+","+bottomLY+"\n"+topRX+","+topRY+"\n");
        //this works :)
        
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
