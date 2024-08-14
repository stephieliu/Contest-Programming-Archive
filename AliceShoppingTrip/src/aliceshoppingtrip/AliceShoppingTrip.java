/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliceshoppingtrip;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
import java.util.Comparator;
public class AliceShoppingTrip {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt(), N = readInt();
        Integer [] arr = new Integer[N];
        for(int i =0; i<N; i++) arr[i] = readInt();
//        Arrays.sort(arr, (a, b) -> (Integer.compare(Math.abs(a), Math.abs(b))));
//        Stream.of(arr).forEach(a -> System.out.println(a));
        Arrays.sort(arr, Comparator.comparingInt(Math::abs));
        int sum = 0, count = 0, currPos = 0;
        for(int i = 0; i<N && sum<=T; i++){
            if(sum>T) break;
            int diff = Math.abs(currPos-arr[i]);
            sum+=diff;
            count++;
            currPos = arr[i];
            if(sum>T){
                count--;
                break;
            }
        }
        System.out.println(count);
    }
//    static []int absSort(int[] arr){
//        //function comparison function
//        static int absoluteValueComparison(int a, int b) {
//            //sort integers by absolute value
//            if (Math.abs(a) < Math.abs(b)) {
//                return -1;
//            } else if (Math.abs(a) > Math.abs(b)) {
//                return 1;
//                //sort identical absolute values in numerical order
//            } else if (a < b) {
//                return -1;
//            } else if (a > b) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        return arr.sort(absoluteValueComparison);
//    }
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
