/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problema;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TSSClubFair2017ProblemA {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        for(int i = 0; i<N; i++){
            Map<String, Integer> instructions = new HashMap<>();
            String [] arr = readLine().split(" ");
            for(int j = 0; j<3; j++){
                String s = arr[j];
                if(instructions.containsKey(s)){
                    instructions.put(s, instructions.get(s)+1);
                }
                else instructions.put(s, 1);
            }
            //System.out.println(instructions);
            boolean found = true;
            for(String s: instructions.keySet()){
                if(instructions.get(s)>=2){
                    found = true;
                    System.out.println(s);
                    break;
                }
                else found = false;
            }
            if(!found) System.out.println("???");
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
