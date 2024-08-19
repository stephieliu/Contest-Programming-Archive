/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromicintegerpartitions;

import java.util.*;
import java.io.*;

/**
 *
 * @author steph
 */
public class PalindromicIntegerPartitions {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int count = 0;
    static List<String> list = new ArrayList();
    
    static void Permutn(String str, String ans) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }
        boolean alpha[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i)
                    + str.substring(i + 1);
            if (alpha[ch-'0'] == false) {
                Permutn(ros, ans + ch);
            }
            alpha[ch-'0'] = true;
        }
    }
    static void printArray(int p[], int n){
        String s = "";
        for(int i = 0; i < n; i++){
            s += Integer.toString(p[i]);
        }
        Permutn(s, "");
        while(!list.isEmpty()){
            if(isPalindrome(list.remove(0))) count++;
        }
    }
    static void printAllUniqueParts(int n){
        int[] p = new int[n]; 
        int k = 0; 
        p[k] = n;
        while(true){
            printArray(p, k + 1); 
            int rem_val = 0;
            while(k >= 0 && p[k] == 1){
                rem_val += p[k];
                k--;
            }
            if(k < 0){
                return;
            }
            p[k]--;
            rem_val++;
            while (rem_val > p[k]){
                p[k + 1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }
            p[k + 1] = rem_val;
            k++;
        }
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        printAllUniqueParts(N);
        System.out.println(count);
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        System.out.println(s);
        return true;
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
