/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candydivision;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CandyDivision {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] arr = new int[N];
        boolean allsame = false;
        arr[0] = readInt();
        int x = arr[0];
        for(int i = 1; i<N; i++){
            arr[i] = readInt();
            if(i>0 && arr[i] == x) {
                allsame = true;
            }
        }
        if (N%2 != 0) System.out.println(0);
        else{
            if(allsame){
                System.out.println(0);
            }
            else{
                Arrays.sort(arr);
                int low = arr[N/2-1];
                int high = arr[N/2], count = 0;
                for(int i = low+1; i<=high; i++){
                    count++;
                }
                System.out.println(count);
            }
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
