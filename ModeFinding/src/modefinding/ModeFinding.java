/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modefinding;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ModeFinding {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static HashMap<Integer, Integer> mode(int[] array){
        HashMap<Integer, Integer> hm = new HashMap<>();
//        int max = 0;
//        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if (hm.get(array[i]) != null) {
                int count = hm.get(array[i]);
                count++;
                hm.put(array[i], count);
//                if (count >= max) {
//                    max = count;
//                    temp.add(array[i]);
//                }
            }
            else{
                hm.put(array[i], 1);
            }
        }
        return hm;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] array = new int[N];
        for(int i = 0; i<N; i++){
            array[i] = readInt();
        }
        Map<Integer, Integer> mymap = mode(array);
        int max = Integer.MIN_VALUE;
        List<Integer> maxvals = new ArrayList<>();
        for(Integer i : mymap.values()){
            if(i>=max){
                max = i;
            }
        }
        List<Integer> listOfKeys = MapUtilities.getAllKeysForValue(mymap, max);
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
