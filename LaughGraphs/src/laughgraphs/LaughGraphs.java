/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laughgraphs;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class LaughGraphs {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), rows = 0;
        boolean extrarows = false;
        char[] laugh = next().toCharArray();
        int t1 = 1, t2 = 0;
        for(int i = 0; i<N; i++){
            if(laugh[i] == 'v') t1++;
            else if(laugh[i] == '^')t2++;
        }
        rows = Math.max(t1, t2);
        if(rows == t1){
            extrarows = true;
        }
        System.out.println(rows);
        char[][] output;
        if(extrarows){
            output = new char[rows+1][N];
        }
        else output = new char[rows][N];
        for(int i = 0; i<rows; i++){
            Arrays.fill(output[i], '.');
        }
        int r = 0, c = 0;
        for(char i:laugh){
            if(i == 'v'){
                r++;
                output[r][c] = '\\';
                c++;
            }
            else if(i == '>'){
                output[r][c] = '_';
            }
            else{
                c++;
                output[r][c] = '/';
                r--;
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<N; j++){
                System.out.print(output[i][j]);
            }
            System.out.println();
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
