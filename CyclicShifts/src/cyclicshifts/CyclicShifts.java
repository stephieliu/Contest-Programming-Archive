/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicshifts;



/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String T = next();
        String S = next();
        String [] shifts = new String [S.length()];
        boolean yes = false;
        for(int i = 0; i<S.length(); i++){
            String temp = "";
            
            for(int j = i+1; j<S.length(); j++){
                temp+=S.charAt(j);
            }
            if(i>0){
                temp += S.substring(0, i+1);
            }
            else{
                temp+=S.charAt(i);
            }
            if(T.contains(temp)){
                System.out.println("yes");
                yes = true;
                break;
            }
        }
        if(yes==false){
            System.out.println("no");
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
