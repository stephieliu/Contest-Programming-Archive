/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractproblem;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AbstractProblem {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        for(int i = 0; i<T; i++){
            long X = readLong(), count = 0;
            while(X!=0){
                if(X == 3){
                    count += 3;
                    break;
                }
                if(X == Long.MAX_VALUE){
                    X = X/4 + 1;
                    count += 3;
                    continue;
                }
                if(X%2 == 0){
                    X /=2;
                    count++;
                }
                else{
                    if(X%4 == 1){
                        X -= 1;
                        count++;
                    }
                    else if(X%4 == 3){
                        X += 1;
                        count++;
                    }
                }
            }
            System.out.println(count);
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
