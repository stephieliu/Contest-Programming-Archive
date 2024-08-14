/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.sfightingwithmonsters;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobSFightingWithMonsters {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long N = readLong(), K = readLong();
        long mod = N%K;
        List<Long> possible = new ArrayList<>();
        while(!possible.contains(mod)){
            possible.add(mod);
            mod = Math.abs(mod-K);
//            System.out.print(mod+" ");
        }
        Collections.sort(possible);
        System.out.println(possible.get(0));
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }    
}
