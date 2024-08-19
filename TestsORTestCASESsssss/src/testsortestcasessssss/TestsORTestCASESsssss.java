/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsortestcasessssss;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class TestsORTestCASESsssss {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, len;
    static List<String> set[], ans;
    public static void main(String[] args) throws IOException {
        n = readInt(); len= readInt();
        set = new ArrayList[n];
        ans = new ArrayList();
        for(int i = 0; i<n; i++){
            set[i] = new ArrayList();
            int k = readInt();
            if(i>0) set[i].add("");
            for(int j = 0; j<k; j++){
                set[i].add(next());
            }
        }
        fun(0, "");
        Collections.sort(ans);
        for(String x: ans){
            System.out.println(x);
        }
    }
    static void fun(int id, String word){
        if(id==n||word.length() == len){
            ans.add(word);
            return;
        }
        else{
            for(String x: set[id]){
                fun(id+1, word+x);
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
