/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolutelyacidic1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AbsolutelyAcidic1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), R[] = new int[N];
        Map<Integer, Integer> freq = new TreeMap<>();
        int max1 = -1, max2 = -1;
        for(int i = 0; i<N; i++){
            R[i] = readInt();
        }
        Arrays.sort(R);
        for(int i = 0; i<N; i++){
            int temp = 0;
            if(freq.containsKey(R[i])){
                temp = freq.get(R[i]);
                freq.remove(R[i]);
            }
            temp++;
            freq.put(R[i], temp);
        }
        System.out.println(freq);
        int i1 = 0, i2 = 0;
        for(int i = 0; i<N; i++){
            max1 = Math.max(freq.get(R[i]), max1);
            if(max1 == freq.get(R[i])){
                i1 = i;
            }
        }
        System.out.println(R[i1]);
        freq.remove(R[i1]);
        System.out.println(freq);
        for(int i = 0; i<N; i++){
            if(R[i]!=R[i1]){
                max2 = Math.max(freq.get(R[i]), max2);
                if (max2 == freq.get(R[i])) {
                    i2 = i;
                }
            }
        }
        System.out.print(i1+" "+i2+"\n");
        System.out.println(Arrays.toString(R));
        System.out.println(Math.max(Math.abs(R[i1]-R[i2]), Math.abs(R[i2]-R[i1])));
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
