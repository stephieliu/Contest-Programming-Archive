/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalcontracts;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ConditionalContracts {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Map<Integer, Integer> actors = new TreeMap<>();
        for(int i = 0; i<N; i++){
            int temp = readInt();
            if(!actors.containsKey(temp)){
                actors.put(temp, 1);
            }
            else{
                int s = actors.get(temp);
                actors.remove(temp);
                actors.put(temp, s+1);
            }
        }
        System.out.println(actors);
        //sort the map by the number of values
        
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
