/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.smedianstudent;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSMedianStudent {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Map<Integer, List<String>> map = new TreeMap<>();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            String temp = next();
            int x = readInt();
            List<String> s = new ArrayList<>();
            if(map.containsKey(x)){
                s = map.get(x);
                s.add(temp);
            }
            else s.add(temp);
            arr[i] = x;
            map.put(x, s);
        }
        Arrays.sort(arr);
        int median = arr[N/2];
        List<String> s = map.get(median);
        Collections.sort(s);
        if(s.size()>1){
            System.out.println(s.get(s.size()/2));
        }
        else System.out.println(s.get(0));
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
