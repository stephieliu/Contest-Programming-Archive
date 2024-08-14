/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alice.sshoppingtrip;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AliceSShoppingTrip {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt(), N = readInt();
        Map<Integer, String> map = new TreeMap();
        int [] arr = new int[N];
        int [] abs = new int [N];
        for(int i = 0; i<N; i++){
            int j = readInt();
            if(j<0){
                map.put(Math.abs(j), "-");
                abs[i] = Math.abs(j);
            }
            else map.put(Math.abs(j), "+");
        }
        int count = 0;
        int sum = 0;
        Set<Integer> keys = map.keySet();
        int x = 0;
        for(Integer key:keys) arr[x++] = key.intValue();
        for(int i = 0;i<N;i++){
            sum+=arr[i];
            if(map.get(arr[i]).equals("-")){
                int diff = 
            }
           if(sum<=T){
                count++;
            }
            else break;
        }
        System.out.println(count);
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
