/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripplanning;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TripPlanning {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), arr[][] = new int[N][2], arr1[][] = new int[N][2];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                arr[i][j] = readInt();//reads xi and yi
            }
            for(int j = 0; j<2; j++){
                arr1[i][j] = readInt();//reads wi and hi
            }
        }
        int x = readInt(), y = readInt();
        //run through arr and arr1 backward, compare to see if xi<=x and xi+w1>=x
        //yi<=y and yi+hi>=y
        int index = -1;//store the end colour
        for(int i = N-1; i>=0; i--){
            if(arr[i][0]<=x && arr[i][0]+arr1[i][0]>=x && arr[i][1]<=y && arr[i][1]+arr1[i][1]>=y){
                index = i+1;
                break;
            }
        }
        System.out.println(index);
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
