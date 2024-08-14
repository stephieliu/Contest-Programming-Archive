/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alicethroughthelookingglassbruceversion;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AliceThroughTheLookingGlassBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int block[][] = new int[5][5];
    public static void main(String[] args) throws IOException {
        int T = readInt();
        block[1][0] = block[2][0] = block[3][0] = block[2][1] = 1;//crystal
        block[1][1] = block[2][2] = block[3][1] =-1; //not sure
        for(int t = 1; t<=T; t++){
            int m = readInt(), x = readInt(), y = readInt();
            if(contains(m,x,y)) System.out.println("crystal");
            else System.out.println("empty");
        }
    }
    static boolean contains(int m, int x, int y){
        if(m==1) return block[x][y] == 1;
        int size = (int) Math.pow(5, m-1), bx = x/size, by = y/size;
        if(block[bx][by]==1) return true;
        else if(block[bx][by]==0) return false;
        else return contains(m-1, x%size, y%size);
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
