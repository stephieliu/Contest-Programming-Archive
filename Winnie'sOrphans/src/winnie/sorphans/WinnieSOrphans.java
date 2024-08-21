/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winnie.sorphans;

/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
public class WinnieSOrphans {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int N = readInt();
        int M = readInt();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<N; i++){
            int count = 0;
            for(int j = 0; j<M; j++){
                int orphan = readInt();
                if(orphan==1 || orphan==10){
                    count++;
                }
            }
            if(count<min){
                min = count;
                index = i;
                break;
            }    
        }
        System.out.println(index+1);
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
