/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandombicycleolympiads;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class TandomBicycleOlympiads {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int readInt () throws IOException {
		return Integer.parseInt(next());
    }
    static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
    public static void main(String[] args) throws IOException{
        int N = readInt(), W = readInt(), weight [] = new int [N+1];
        for(int i = 1; i<=N; i++){
            weight[i] = readInt();
        }
        Arrays.sort(weight);
        long ans = 0;
        for(int L = 1, R = N; L<R;){
            if(weight[L]+weight[R]<=W){
                ans+=R-L;
                L++;
            }
            else{
                R--;
            }
        }
        
        System.out.println(ans);
//        int sum = 0;
//        int count = 0;
//        for(int i = 0; i<N; i++){
//            for(int j = i+1; j<N; j++){
//                sum = weight[i]+weight[j];
//                if(sum<=W){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
    
}
