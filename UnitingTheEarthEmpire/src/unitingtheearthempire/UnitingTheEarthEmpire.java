/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitingtheearthempire;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class UnitingTheEarthEmpire {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();//number of hills
        int H[] = new int[N+1], index[] = new int [N+1];
        int top = -1;
        int sum = 0;
        top++; H[top] = Integer.MAX_VALUE; index[top] = 0;
        int hills[] = new int[N];
        
        for(int i = 0; i<N; i++){
            hills[N-i-1] = readInt();
        }
        
        for(int i = 0; i<N; i++){
            while (H[top] <= hills[i]) {
                top--;
            }
            sum+=(i - index[top]);
//            System.out.print(i-index[top]+" ");
            top++;
            H[top] = hills[i];
            index[top] = i;
        }
//        System.out.println(Arrays.toString(hills));
        System.out.println(sum);
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
