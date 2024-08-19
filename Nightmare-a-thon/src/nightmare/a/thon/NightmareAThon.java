/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightmare.a.thon;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class NightmareAThon {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), Q = readInt();
        int [] ratings = new int[N];
        for(int i = 0; i<N; i++){
            ratings[i] = readInt();
        }
        int[] maxfromleft = new int[N];
        int [] freqleft = new int[N];
        int [] freqright = new int[N];
        int maxfromright[] = new int[N];
        maxfromleft[0] = ratings[0];
        maxfromright[N-1] = ratings[N-1];
        freqleft[0] = freqright[N-1] = 1;
        for(int i = 1; i<N; i++){
            if(ratings[i]>maxfromleft[i-1]){
                maxfromleft[i] = ratings[i];
                freqleft[i] = 1;
            }
            else if(ratings[i] == maxfromleft[i-1]){
                maxfromleft[i] = maxfromleft[i-1];
                freqleft[i] = freqleft[i-1]+1;
            }
            else{
                maxfromleft[i] = maxfromleft[i-1];
                freqleft[i] = freqleft[i-1];
            }
        }
        for(int i = N-2; i>-1; i--){
            if(ratings[i]>maxfromright[i+1]){
                maxfromright[i] = ratings[i];
                freqright[i] = 1;
            }
            else if(ratings[i]==maxfromright[i+1]){
                maxfromright[i] = maxfromright[i+1];
                freqright[i] = freqright[i+1]+1;
            }
            else{
                maxfromright[i] = maxfromright[i+1];
                freqright[i] = freqright[i+1];
            }
        }
        System.out.println(Arrays.toString(maxfromright));
        System.out.println(Arrays.toString(maxfromleft));
        for(int i = 0; i<Q; i++){
            int a = readInt(), b = readInt(), max2 = Math.max(maxfromleft[a-1], maxfromright[b+1]), max3 = 0;
            if(maxfromleft[a-1]==maxfromright[b+1]){
                max3 = freqleft[a-1]+freqright[b+1];
            }
            else if(maxfromleft[a-1]>maxfromright[b+1]){
                max3 = freqleft[a-1];
            }
            else{
                max3 = freqright[b+1];
            }
            System.out.println(max2+" "+max3);
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
