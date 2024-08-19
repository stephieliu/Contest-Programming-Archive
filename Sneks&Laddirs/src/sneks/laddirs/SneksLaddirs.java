/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneks.laddirs;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class SneksLaddirs {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int dice = readInt();
        int square = 1;
        while(dice!=0){
            square += dice;
            if(square>100){
                square-=dice;
            }
            else{
                switch (square) {
                    case 9:
                        square = 34;
                        break;
                    case 54:
                        square = 19;
                        break;
                    case 40:
                        square = 64;
                        break;
                    case 67:
                        square = 86;
                        break;
                    case 90:
                        square = 48;
                        break;
                    case 99:
                        square = 77;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("You are now on square "+square);
            if(square == 100){
                System.out.println("You Win!");
                return;
            }
            dice = readInt();
        }
        System.out.println("You Quit!");
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
