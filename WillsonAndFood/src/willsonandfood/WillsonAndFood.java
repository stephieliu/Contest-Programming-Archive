/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willsonandfood;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class WillsonAndFood {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int F = readInt();
        Map<String, Integer> food = new HashMap<>();
        for (int i = 0; i < F; i++) {
            String s = next();
            int x = readInt();
            food.put(s, x);
        }
        int N = readInt();
        Map<Integer, List<String>> items = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String s = next();
            int x = readInt();
            if (items.get(x) != null) {
                List<String> temp = items.get(x);
                temp.add(s);
                items.put(x, temp);
            } else {
                List<String> temp = new ArrayList();
                temp.add(s);
                items.put(x, temp);
            }
        }
//        System.out.println(items.toString());
        int energy = 0;
        int eats = 0;
        int diff = 0;
        //System.out.println(items.toString());
        for (Map.Entry<Integer, List<String>> entry : items.entrySet()) {
            diff = 0;
            Integer key = entry.getKey();
            List<String> value = entry.getValue();
            diff -= key;
            energy -= diff;
            
            if (key <= energy) {
                while (!value.isEmpty()) {
                    String s = value.remove(0);
                    energy += food.get(s);
                    eats++;
                }
            } else {
                break;
            }
            
            //System.out.println(energy+" "+diff);
        }
        System.out.println(eats);
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
