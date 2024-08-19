/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwavebuttonssss;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MicrowaveButtonssss {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String desired = next();
        String [] time = desired.split(":");
        //System.out.println(Arrays.toString(time));
        int t = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60
                +Integer.parseInt(time[2]);
        //System.out.println(t);
        String buttons = next();
        String possible = "";
        int bestTime = Integer.MAX_VALUE;
        String best = "";
        for(int i = 0; i<buttons.length();i++){
            for(int j = 0; j<buttons.length(); j++){
                for(int m1 = 0; m1<buttons.length(); m1++){
                    for(int m = 0; m<buttons.length(); m++){
                        for(int s1 = 0; s1<buttons.length(); s1++){
                            for(int s = 0; s<buttons.length(); s++){
                                possible = Character.toString(buttons.charAt(i))+Character.toString(buttons.charAt(j))+":"
                                        +Character.toString(buttons.charAt(m1))+Character.toString(buttons.charAt(m))+":"
                                        +Character.toString(buttons.charAt(s1))+Character.toString(buttons.charAt(s));
                                String [] tem = possible.split(":");
                                int temp = Integer.parseInt(tem[0])*3600+Integer.parseInt(tem[1])*60
                                        +Integer.parseInt(tem[2]);
                                if(Math.abs(temp - t)<Math.abs(t-bestTime)){
                                    bestTime = temp;
                                    best = possible;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(best);
//        System.out.println(desired.length());
//        int desiredTime = 0;
//        for(int i = 1; i<4; i++){
//            desiredTime+= Integer.parseInt(desired.substring(0,i*2+1))*(60*(i-1));
//        }
//        System.out.println(desiredTime);
//        String works = next();
        
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
