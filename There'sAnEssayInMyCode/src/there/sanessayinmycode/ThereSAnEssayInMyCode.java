/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package there.sanessayinmycode;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ThereSAnEssayInMyCode {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int t = 1; t<=5; t++){
            String s = readLine(), ans = "";
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i)=='"'){
                    int nxt = s.indexOf("\"", i+1);
                    ans += " "+ s.substring(i+1, nxt); i= nxt;
                }
                else if(s.charAt(i) == '\''){
                    int nxt = s.indexOf("\'", i+1);
                    ans+= " "+ s.substring(i+1, nxt); i = nxt;
                }
                else if(s.charAt(i) == '/' && i+1 < s.length() && s.charAt(i+1) == '*'){
                    int nxt = s.indexOf("*/", i+1);
                    ans+= " "+ s.substring(i+2, nxt); i = nxt;
                }
                else if(s.charAt(i) == '/' && i+1 < s.length() && s.charAt(i+1) == '/'){
                    ans+= " "+ s.substring(i+2); i = s.length();
                }
            }
            System.out.println(ans.substring(1));
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
