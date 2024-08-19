/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madscientist;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MadScientist {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        String A = next(), B = next();
        int times = 0;
        if(A.equals(B)) System.out.println("0");
        else{
            times = 1;
            int [] continuous = new int [N];
           // String str = "";
            for(int i = 0; i<N; i++){
                char s = A.charAt(i);
                char x = B.charAt(i);
                if(s!=x){
                    continuous[i] = 0;
                    //str+="0";
                }
                else{
                    continuous[i] = 1;
                   // str+="1";
                }
            }
            for(int i = 1; i<N; i++){
                if(continuous[i]==0 && continuous[i-1]!=0){
                    times++;
                }
            }
            System.out.println(times);
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
