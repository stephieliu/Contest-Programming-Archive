/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialdistancingi;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SocialDistancingI {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        String s = next(), st = "";//contains 0 and 1
        String [] str = s.split("1");
        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//        System.out.println(str[str.length-1]);
        String longest = str[str.length-1];
        String longer = str[str.length-2];
        int x = s.indexOf(longest), y = s.indexOf(longer);
        if(longest.length()%2==0){
            x += longest.length()/2-1;
        }
        else x+=longest.length()/2;
        if(longer.length()%2 == 0){
            y+=longer.length()/2-1;
        }
        else y+= longer.length()/2;
        for(int i = 0; i<N; i++){
            if(i==x){
                st+="1";
            }
            else if(i==y){
                st+="1";
            }
            else st+=s.charAt(i);
        }
        String [] arr = st.split("1");
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1].length());
//        System.out.println(st);
//        System.out.println(x+" "+y);
//        
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
