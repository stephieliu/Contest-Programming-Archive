/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hightidelowtide;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class HighTideLowTide {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(); 
        int s[] = new int[N];
        for(int i = 0; i<N; i++){
            s[i] = readInt();
        }
        Arrays.sort(s);
        //System.out.println(Arrays.toString(s));
        int low = 0;
        if(N%2 == 0) low = N/2-1;
        else low = N/2;
        int high = low+1;
        for(int i = 0; i<N; i++){
            if(i%2 == 0){
                System.out.print(s[low]+" ");
                low--;
            }
            else{
                System.out.print(s[high]+" ");
                high++;
            }
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
