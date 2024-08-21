/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingtheccc;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;

public class WritingTheCCC {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        String[] preferences = new String [T];
        for(int i = 0; i < T; i++){
            preferences[i] = readLine();
        }
        int N = readInt();
        Map<String, List<Integer>> problems = new HashMap();
        for(int i = 0; i<N; i++){
            List<Integer> tmp = new ArrayList<>();
            String temp = readLine();
            tmp.add(i+1);
            if(!problems.containsKey(temp)){
                problems.put(temp, problems.getOrDefault(temp, tmp));
            }
            else{
                for(int j = 0; !problems.get(temp).isEmpty();){
                    tmp.add(problems.get(temp).remove(j));
                }
                problems.put(temp, tmp);
            }
        }
        for(String key : preferences){
            if(problems.containsKey(key)){
                List<Integer> t = problems.get(key);
                t.sort(Comparator.naturalOrder());
                for(int j = 0; !t.isEmpty();){
                    System.out.println(t.remove(j));
                }
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
