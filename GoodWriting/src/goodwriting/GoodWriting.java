/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodwriting;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class GoodWriting {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int q = readInt();
        for(int i = 0; i<q; i++){
            int n = readInt(), k = readInt();
            String s = "Good writing is good writing is good writing.";
            if(n!=0){
                String nn = quote("Good writing is good writing is good writing.", n-1, 0, k);
                //System.out.println(nn);
                if(k<22){
                    s = "Good writing is good ";
                    k -= 1;
                }
                else if(k>21 && k<=22+nn.length()){
                    s = nn;
                    k = k-22;
                }
                else if(k>22+nn.length() && k<=22+nn.length()+17){
                    s = " writing is good ";
                    k = k-(22+nn.length());
                }
                else if(k>22+nn.length()+17 && k<=22+nn.length()+17+nn.length()){
                    s = nn;
                    k = k-(22+nn.length()+17);
                }
                else{
                    s = " is good writing.";
                    k = k-(22+nn.length()+17+nn.length());
                }
                k++;
//                else if(k>=2*(22+nn.length())+22+17){
//                    s = " is good writing.";
//                    k = k-2*(22+nn.length())+22+17+1;
//                }
//                else if(k>=22+nn.length() && k<22+nn.length()+17){
//                    s = nn;
//                    k = k-22+nn.length()+1;
//                }
//                else{
//                    s = nn;
//                    k = k-22+nn.length()+17+1;
//                }
            }
            System.out.println(s+"\n"+k);
            if(k>s.length()) System.out.println(".");
            else System.out.println(s.charAt(k-1));
        }
    }
    static String quote(String s, int n, int t, int k){ //n is the n from
        //the for loop, t = counter
        if(t>=n) return s;
        if(s.length()>=k){
            s = s.substring(0, k);
            return s;
        }
        else{
            s = "Good writing is good "+s+" writing is good "+s
                    +" is good writing.";
            t++;
            return quote(s, n, t, k);
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
