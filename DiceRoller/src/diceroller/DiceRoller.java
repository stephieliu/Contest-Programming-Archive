/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */

public class DiceRoller {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int min = 1;
        int max = 6;
        int r1 = (int) (Math.floor(Math.random()*(max-min+1))+min);
        int r2;
        int [] arr = new int[6];
        int [] sums = new int[12];//for the sums
        System.out.println("How many dice?");
        int dice = readInt();
        for(int i = 0; i<dice; i++){
            r1 = (int) (Math.floor(Math.random()*(max-min+1))+min);
            r2 = (int) (Math.floor(Math.random()*(max-min+1))+min);
            //roll the die/dice
//            System.out.println(r1);
//            if(r1==1) arr[0]++;
//            else if(r1==2) arr[1]++;
//            else if(r1==3) arr[2]++;
//            else if(r1==4) arr[3]++;
//            else if(r1==5) arr[4]++;
//            else arr[5]++;
            
            //sum
            System.out.println(r1 + r2);
            sums[r1+r2-1]++;
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sums));
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
