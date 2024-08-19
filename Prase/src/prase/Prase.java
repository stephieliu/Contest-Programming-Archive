/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prase;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Prase {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), warn = -1;
        String[] arr = new String[100];
        //boolean flag = true;
        for(int i = 0; i<=N-1; i++){
            int count = 0;
            //if (flag) arr[i] = readLine();
            //if(readLine().equals(prevStr)) flag = false;
            arr[i] = readLine();
            for(int j = 1; j<i; j++){
                if(arr[j].equals(arr[i])) count++;
                //if(arr[i].equals(arr[i+1]))) count++;
                if(i - 1 - count < count) warn++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(warn);
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
