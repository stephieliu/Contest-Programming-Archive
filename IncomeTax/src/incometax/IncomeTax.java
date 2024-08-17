/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        System.out.println("What is your income? ");
        int income = readInt();
        System.out.println("What is your housing cost? ");
        int houseCost = readInt();
        System.out.println("How many children do you have? ");
        int totalChildren = readInt();
        System.out.println("How many children are in school? ");
        int schoolChildren = readInt();
        double tax = 0;
        if(houseCost>=8000){
            tax = 0.18*income;
        }
        
        else{
            tax = (income - 10000)*0.18;
        }
        tax = tax-schoolChildren*1000 - (totalChildren - schoolChildren)*500;
        if(houseCost<6000 && (schoolChildren>=2 && schoolChildren>=1)){
            tax = tax;
        }
        else{
            tax = 0;
        }
        if(tax>2000){
            tax = tax+tax*0.15;
        }
        if(tax<0){
            System.out.println("Refund is "+-1*tax);
        }
        else{
            System.out.println("Tax payable is: "+tax);
        }
        System.out.println(tax);
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
