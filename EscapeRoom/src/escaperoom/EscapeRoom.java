/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaperoom;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int M = readInt();
        int N = readInt();
        int [][] grid = new int [M][N];
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N;j++){
                grid[i][j] = readInt();
            }
        }
        
        int endTarget = M*N;
        int coorX = 0, coorY = 0;
        while(endTarget!=0){
            coorX = 0;
            coorY = 0;
            boolean found = false;
            for(int i = 0; i<M; i++){
                for(int j = 0; j<N;j++){
                    if(grid[i][j]==endTarget){
                        coorX = i+1;
                        coorY = j+1;
                        found = true;
                        break;
                    }
                }
                if(found==true){
                    break;
                }
            }
            endTarget = coorX*coorY;
            if(coorX == coorY && coorX == 1){
                break;
            }
        }
        if(coorX == 1 && coorY == 1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
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
