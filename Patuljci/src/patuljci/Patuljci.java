/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patuljci;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Patuljci {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        for(int i = 0; i<9; i++){
            arr[i] = readInt();
        }
        Integer[][] list = combinations(arr);
        Integer[] l = new Integer[7];
        for(int i = 0; i<list.length; i++){
            int sum = 0;
            for(int j = 0; j<list[i].length; j++){
                sum+=list[i][j];
            }
            if(sum==100){
                l = list[i];
                sum = 0;
            }
        }
        for(int i = 0; i<7; i++){
            System.out.println(l[i]);
        }
    }
    public static Integer[][] combinations(int[] ports) {
        List<Integer[]> combinationList = new ArrayList<Integer[]>();
        // Start i at 1, so that we do not include the empty set in the results
        for (long i = 1; i < Math.pow(2, ports.length); i++) {
            List<Integer> portList = new ArrayList<Integer>();
            for (int j = 0; j < ports.length; j++) {
                if ((i & (long) Math.pow(2, j)) > 0) {
                    // Include j in set
                    portList.add(ports[j]);
                }
            }
            if(portList.size()==7){
                combinationList.add(portList.toArray(new Integer[0]));
            }
        }
        return combinationList.toArray(new Integer[0][0]);
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
