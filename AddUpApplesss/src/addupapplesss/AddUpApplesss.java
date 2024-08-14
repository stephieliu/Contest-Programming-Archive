/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addupapplesss;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AddUpApplesss {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int count = 0;
//    static void printArray(int p[], int n, int num){ 
//        if(n>1){
//            System.out.print(num +"=");
//            for (int i = 0; i < n-1; i++) 
//                System.out.print(p[i]+"+"); 
//            System.out.print(p[n-1]);
//            System.out.println();
//            count++;
//        }
//    }
    static List<List<Integer>> list = new ArrayList();
    static void print(int p[]){
        
        List<Integer> yes = new ArrayList();
        if(p.length>1){
            for(int i = 0; i<p.length; i++){
                yes.add(p[i]);
            }
            list.add(yes);
            count++;
        }
    }
    static void printAllUniqueParts(int n){ 
        int[] p = new int[n];
        int k = 0;
        p[k] = n;
        while (true){
            //printArray(p, k+1, n);
            print(p);
            int rem_val = 0; 
            while (k >= 0 && p[k] == 1){ 
                rem_val += p[k]; 
                k--; 
            } 
            if (k < 0)  return; 
            p[k]--; 
            rem_val++;
            while (rem_val > p[k]){ 
                p[k+1] = p[k]; 
                rem_val = rem_val - p[k]; 
                k++; 
            } 
            p[k+1] = rem_val; 
            k++; 
        } 
    } 
    public static void main(String[] args) throws IOException {
        int N = readInt();
        printAllUniqueParts(N);
        for(int i = 0; i<list.size(); i++){
            List<Integer> temp = list.get(i);
            Collections.sort(temp);
            for(int j = 0; j<temp.size()-1; j++){
                System.out.print(temp.get(i)+"+");
            }
            System.out.print(temp.get(temp.size()-1)+"\n");
        }
        System.out.println("total="+count);
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
