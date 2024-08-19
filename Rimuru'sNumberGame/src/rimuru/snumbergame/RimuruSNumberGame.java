/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rimuru.snumbergame;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class RimuruSNumberGame {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        long N = readLong();
        //Loop method:
        List<Long> values = new ArrayList();
        values.add(0L);//if you add L it converts to long
        for(int i = 0; ;i++){
            long cur = values.get(i);
            if(cur*10+2>N){
                break;
            }
            else values.add(cur*10+2);
            if(cur*10+3>N){
                break;
            }
            else values.add(cur*10+3);
        }
        //for(long x: values) System.out.print(x+" );
        //System.out.println();
        System.out.println(values.size()-1);
        //Recursion method:
        //System.out.println(countNums(2,N)+countNums(3, N));
    }
    //recursion:
//    static int countNums(long cur, long N){
//        if(cur>N){
//            return 0;
//        }
//        else{
//            return 1+countNums(cur*10 + 2, N)+countNums(cur*10+3, N);
//        }
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
