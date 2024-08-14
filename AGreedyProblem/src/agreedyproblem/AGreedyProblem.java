/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agreedyproblem;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AGreedyProblem {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        long N = readLong(), M = readLong(), boxes[][] = new long[(int)N][2];
        //boxes[x][0] = price, boxes[x][1] = amount
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                boxes[i][j] = readLong();
            }
        }
        Arrays.sort(boxes, new cmp());//sort by price
//        System.out.println("==========================");
//        for(int i = 0; i<N; i++){
//            for(int j = 0; j<2; j++){
//                System.out.print(boxes[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("==========================");
        long count = 0;
        long price = 0;
        for(int i = 0; i<N; i++){
            if(count>M){
                long over = count-M;
                price-=over*boxes[i-1][0];
                break;
            }
            count+=boxes[i][1];
            price += boxes[i][0] * boxes[i][1];
        }
        
        System.out.println(price);
    }
    static class cmp implements Comparator<long[]> {
        public int compare(long[] a, long[] b) {
            return Long.compare(a[0], b[0]);
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
