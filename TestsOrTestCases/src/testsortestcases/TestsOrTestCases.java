/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsortestcases;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TestsOrTestCases {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), L = readInt();
        ArrayList<List<String>> list = new ArrayList<>();
        for(int i =0; i<N; i++){
            int M = readInt();
            List<String> S = new ArrayList<>();
            for(int j = 0; j<M; j++){
                S.add(next());
            }
            list.add(S);
        }
        System.out.println(list.toString());
        //recursion(list, L);
        for(int i =0; i<list.get(0).size(); i++){
            String str = "";
            for(int j = 1; j<L; j++){
                
            }
        }
    }
    public static String recursion(ArrayList<List<String>> arr, int x){
        
        return "";
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
