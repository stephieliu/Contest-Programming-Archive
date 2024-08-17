/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funghi;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Funghi {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int [] arr = new int[8];
        for(int i = 0; i<8; i++){
            arr[i] = readInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<8; i++){
            int count = 0, sum = 0;
            for(int j = i; count<4; j++){
                //System.out.println(j);
                if(j<8){
                    sum+=arr[j];
//                    if(sum>max){
//                        max = sum;
//                    }
                }
                else{
                    sum+=arr[Math.abs(8-j)];
//                    if (sum > max) {
//                        max = sum;
//                    }
                }
                count++;
            }
            if(sum>max) max = sum;
        }
        System.out.println(max);
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
