/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anodasorttingggg;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AnodaSorttingggg {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        String[] arr = new String[N];
        for(int i = 0; i<N; i++){
            arr[i] = next();
        }
        int[] units = new int[N];
        for(int i = 0; i<N; i++){
            String t = arr[i];
            String x = t.substring(t.length()-1);
            x+=t.substring(0, t.length()-1);
            System.out.println(x);
            units[i] = Integer.parseInt(x);
        }
        Arrays.sort(units);
        int[] u = new int[N];
        for (int i = 0; i < N; i++) {
            String t = Integer.toString(units[i]);
            String x = t.substring(1);
            x+=t.substring(0,1);
            System.out.println(x);
            u[i] = Integer.parseInt(x);
        }
        int curr = 0, count = 0;
        List<Integer> print = new ArrayList();
        for(int i = 0; i<N; i++){
            String x = Integer.toString(units[i]);
            if(Character.getNumericValue(x.charAt(0))==curr){
                print.add(count, u[i]);
                count++;
            }
            else if(i==0){
                curr = Character.getNumericValue(x.charAt(0));
                print.add(count, u[i]);
                count++;
            }
            else{
                Collections.sort(print, Collections.reverseOrder());
                while(!print.isEmpty()){
                    System.out.print(print.remove(0)+" ");
                }
                count = 0;
                print.add(count, u[i]);
                count++;
                curr = Character.getNumericValue(x.charAt(0));
            }
        }
        Collections.sort(print, Collections.reverseOrder());
        while(!print.isEmpty()){
            System.out.print(print.remove(0)+" ");
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
