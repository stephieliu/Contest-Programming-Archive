/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class Pet {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                int temp = readInt();
                if(j==0){
                    map.put(i+1,temp);
                }
                else map.put(i+1, map.get(i+1)+temp);
            }
        }
        int max = Integer.MIN_VALUE;
        int keys = 0;
        for(int j = 1; j<=map.size(); j++){
            if(map.get(j)>max){
                max = map.get(j);
                keys = j;
            }
        }
        System.out.println(keys+" "+max);
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
