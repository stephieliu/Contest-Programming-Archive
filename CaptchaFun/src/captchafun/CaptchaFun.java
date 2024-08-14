/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captchafun;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CaptchaFun {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        for(int T=readInt(); T>0; T--){
            int n = readInt(); String ans = "";
            for(int i = 1; i<=n; i++){
                int H = readInt(), W = readInt(), star[] = new int[H], rit[] = new int[H], top = H, bot = 0;
                for(int r = 0; r<H; r++){
                    char s[] = readLine().toCharArray();
                    for(int c = 0; c<W; c++){
                        if(s[c] == '*'){
                            star[r]++;
                            rit[r] = c;
                        }
                    }
                    if(star[r]!=0){
                        top = Math.min(top, r);
                        bot = Math.max(r, bot);
                    }
                }
                int mid = (top+bot+1)/2;
                if(star[mid] == 0){
                    if(bot - mid != mid - top) ans+=7;
                    else if(star[mid-1] == 2) ans += 0;
                    else ans += 1;
                }
                else{
                    if(star[top]!= star[bot]) ans += 4;
                    else if(star[top+1] == 2 && star[bot-1] == 2) ans += 8;
                    else if(star[top+1] == 2) ans += 9;
                    else if(star[bot-1] == 2) ans += 6;
                    else if(rit[top+1]>rit[bot-1]) ans += 2;
                    else if(rit[top+1]<rit[bot-1]) ans += 5;
                    else ans += 3;
                }
            }
            System.out.println(ans);
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
