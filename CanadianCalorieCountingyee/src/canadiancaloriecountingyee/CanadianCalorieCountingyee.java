/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canadiancaloriecountingyee;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class CanadianCalorieCountingyee {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int burger = readInt(), side = readInt(), drink = readInt(), dessert = readInt();
        int calories = 0;
        switch (burger) {
            case 1:
                calories+=461;
                break;
            case 2:
                calories+=431;
                break;
            case 3:
                calories += 420;
                break;
            default:
                break;
        }
        switch (side) {
            case 1:
                calories+=100;
                break;
            case 2:
                calories+=57;
                break;
            case 3:
                calories+=70;
                break;
            default:
                break;
        }
        switch (drink) {
            case 1:
                calories+=130;
                break;
            case 2:
                calories+=160;
                break;
            case 3:
                calories += 118;
                break;
            default:
                break;
        }
        switch (dessert) {
            case 1:
                calories+=167;
                break;
            case 2:
                calories+=266;
                break;
            case 3:
                calories+=75;
                break;
            default:
                break;
        }
        System.out.println("Your total Calorie count is "+calories+".");
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
