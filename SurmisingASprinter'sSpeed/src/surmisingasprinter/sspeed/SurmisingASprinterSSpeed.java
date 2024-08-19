/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surmisingasprinter.sspeed;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class SurmisingASprinterSSpeed {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
       // Map<Integer, Integer> map = new TreeMap<>();
        List<List<Integer>> list = new ArrayList();
        for(int i = 0; i<N; i++){
            List<Integer> l = new ArrayList();
            l.add(readInt()); l.add(readInt());
            list.add(l);
        }
        Collections.sort(list, new ListComparator());
        //System.out.println(list);
        double maxTime = Double.MIN_VALUE;
//        for(Integer x: map.keySet()){
//            
//        }
        for(int i = 0; i<N-1; i++){
            List l = list.get(i);
            List t = list.get(i+1);
            double d = (double) (Integer)l.get(1), d1 = (double)(Integer)t.get(1);
            double time = (double)(Integer)l.get(0), time1 = (double)(Integer)t.get(0);
            double temp = Math.abs(d-d1)/Math.abs(time-time1);
            if(temp>maxTime) maxTime = temp;
        }
        System.out.println(maxTime);
    }
    static class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

        @Override
        public int compare(List<T> o1, List<T> o2) {
            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                int c = o1.get(i).compareTo(o2.get(i));
                if (c != 0) {
                    return c;
                }
            }
            return Integer.compare(o1.size(), o2.size());
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
