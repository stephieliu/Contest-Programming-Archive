/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sstringcut;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class BobSStringCut {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        String S = next();
        int ans = 0;
        ans = commonletters(S);
        System.out.println(ans);
    }
    static int commonletters(String s){
        Set<Character> set = new TreeSet<Character>();
        int res = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            int temp = 0;
            if(freq.containsKey(s.charAt(i))){
                temp = freq.get(s.charAt(i));
            }
            freq.remove(s.charAt(i));
            freq.put(s.charAt(i), temp++);
        }
        System.out.println(freq);
        for(int i = 0; i<s.length(); i++){
            int temp = freq.get(s.charAt(i));
            freq.remove(s.charAt(i));
            freq.put(s.charAt(i), temp--);
            if(freq.get(s.charAt(i)) == 0) set.remove(s.charAt(i));
            else set.add(s.charAt(i));
            int curr = set.size();
            res = Math.max(res, curr);
        }
        System.out.println(set);
        return res;
//        int count = 0;
//        Set<Character> left = new HashSet<Character>();
//        Set<Character> right = new HashSet<Character>();
//        for(int i = 0; i<ii; i++){
//            left.add(s.charAt(i));
//        }
//        for(int i = ii; i<s.length(); i++){
//            right.add(s.charAt(i));
//        }
//        for(char c: left)
//            if(right.contains(c)) count++;
//        return count;
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
