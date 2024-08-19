/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pusheenplaysnekoatsumej4.pkg19;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class PusheenPlaysNekoAtsumeJ419 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Map <String, Integer> freq = new HashMap();
        //value is sorted for Hashmap
        //key is sorted for treemap
        for(int i = 0; i<N; i++){
            String item = readLine();
            freq.put(item, freq.getOrDefault(item, 0)+1);
        }
        String list[] = {"Deluxe Tuna Bitz", "Bonito Bitz",
            "Sashimi","Ritzy Bitz"};
        while(!freq.isEmpty()){
            int max = -1;
            String food = "";
            for(String key: list){
                if(!freq.containsKey(key)){
                    continue;
                }
                if(freq.get(key)>max){
                    max = freq.get(key);
                    food = key;
                }
            }
            System.out.println(food+" "+max);
            freq.remove(food);
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
