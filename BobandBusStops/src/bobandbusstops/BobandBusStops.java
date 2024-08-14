/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobandbusstops;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class BobandBusStops {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int lowerIndex(int arr[], int n, int x) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] >= x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // function to find last index <= y 
    static int upperIndex(int arr[], int n, int y) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] <= y) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return h;
    }

    // function to count elements within given range 
    static int countInRange(int arr[], int n, int x, int y) {
        // initialize result 
        int count = 0;
        count = upperIndex(arr, n, y)
                - lowerIndex(arr, n, x) + 1;
        return count;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt(), Q = readInt();
        int[] stops = new int[N];
        for(int i = 0; i<N; i++){
            stops[i] = readInt();
        }
        Arrays.sort(stops);
//        for(int i = 0; i<Q; i++){
//            int L = readInt(), r = readInt(), count = 0;
//            for(int j = 0; j<N; j++){
//                if(stops[j]>=L && stops[j]<=r){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
        for(int i = 0; i<Q; i++){
            int L = readInt(), r = readInt();
            System.out.println(countInRange(stops, N, L, r));
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
