/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barambee;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Barambee {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String text = readLine();
        String [] words = text.split(" ");
        //System.out.println(Arrays.toString(words));
        System.out.print(words[0]);
        for(int i = 1; i<words.length; i++){
            if(Character.isUpperCase(words[i].charAt(0))){
                //if(i==1) System.out.print(" ");
                System.out.print(". "+words[i]);
            }
            else System.out.print(" "+words[i]);
        }
//        if(Character.isUpperCase(words[words.length-1].charAt(0))){
//            System.out.println(". "+words[words.length-1]+".");
//        }
        System.out.println(".");
        
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
