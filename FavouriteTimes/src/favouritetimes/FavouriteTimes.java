/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favouritetimes;

/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
public class FavouriteTimes {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int D = readInt();
        int rem = D%720;
        //find how many sequences there are in each period (12:00 to 12:00)
        int h = 12, m = 0, count = 0;
        for(int t = 1; t<=rem; t++){
            m++;
            if(m>59){
                m-=60;
                h++;
            }
            if(h>12){
                h-=12;
            }
            int a = h/10, b = h%10, c = m/10, d = m%10;
            if(h>=10 && b-a == c-b && b-a == d-c){
//                System.out.printf("%d:%02d\n", h, m);
                count++;
            }
            else if(h<10 && c-b == d-c){
//                System.out.printf("%d:%02d\n", h, m);
                count++;
            }
        }
        System.out.println(count+ D/720*31);
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
