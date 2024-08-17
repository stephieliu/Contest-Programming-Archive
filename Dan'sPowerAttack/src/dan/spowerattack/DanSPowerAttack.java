/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dan.spowerattack;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class DanSPowerAttack {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        long N = readInt(), D = readInt(), K = readInt();
        List<Long> monsters = new ArrayList<>();
        for(int i = 0; i<N; i++){
            monsters.add(readLong());
        }
        Collections.sort(monsters);
//        System.out.println(monsters);
        int size = monsters.size()-1;
        for(int i = 0; i<K; i++){
            monsters.remove(size);
            size--;
        }
//        System.out.println(monsters);
        long sum = 0;
        for(int i = 0; i<monsters.size(); i++){
            long div;
            if(monsters.get(i)%D!=0){
                div = monsters.get(i)/D+1;
            }
            else div = monsters.get(i)/D;
            sum+=div;
        }
//        System.out.println(sum);
        System.out.println(sum);
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
