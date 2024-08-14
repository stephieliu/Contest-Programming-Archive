/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolutelyacidic;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class AbsolutelyAcidic {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Map<Integer, Integer> sensors = new TreeMap<>();
        for(int i = 0; i<N; i++){
            int sensor = readInt();
            if(!sensors.containsKey(sensor)){
                sensors.put(sensor, 1);
            }
            else{
                int t = sensors.get(sensor);
                sensors.remove(sensor);
                sensors.put(sensor, t+1);
            }
        }
        System.out.println(sensors);
        int t1 = 0, t2 = 0;
        for(int i = 0; i<2; i++){
            int maxval = -1;
            for(int key: sensors.keySet()){
                if(sensors.get(key)>=maxval){
                    maxval = sensors.get(key);
                    if(i == 0){
                        t1 = key;
                    }
                    else{ t2 = key;}
                }
            }
            sensors.remove(t1);
        }
        System.out.println(Math.abs(t1-t2));
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
