/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fliptheswitches;

/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;
public class FlipTheSwitches {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt(), cnt = 1;
        char a[] = readLine().toCharArray();
        
        for(int i = 0, j = 0; i<n;){
            for(j = i+1; j<n; j++){
                if(a[j] != a[i]){
                    cnt++;
                    break;
                }
            }
            i = j;
        }
        
        if(a[n-1] == '0'){
            cnt--;
        }
        
        System.out.println(cnt);
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
