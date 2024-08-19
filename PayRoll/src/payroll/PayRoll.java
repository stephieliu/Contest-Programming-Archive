/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class PayRoll {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        System.out.println("Family name: ");
        String famnam = next();
        System.out.println("Given name: ");
        String givnam = next();
        System.out.println("Hourly rate of pay: ");
        int rate = readInt();
        System.out.println("Number of hours worked that week: ");
        int hours = readInt();
        double extra = 0, pay = 0;
        if(hours>40){
            extra = hours-40;
            pay = ((hours - extra)*rate)+(extra*(2*rate));
        }
        else{
            pay = rate*hours;
        }
        double grosspay = pay;
        System.out.println("Tax category letter: ");
        char taxcat = readCharacter();
        if(taxcat=='B'){
            pay = pay*(0.9);
        }
        else if(taxcat=='C'){
            pay = pay*(0.8);
        }
        else if(taxcat=='D'){
            pay = pay*(0.71);
        }
        else if(taxcat=='E'){
            pay = pay*(0.65);
        }
        System.out.println("Would you like to contribute to the United Way "
                + "Charity? ");
        char charity = readCharacter();
        if(charity=='Y'){
            pay-=20;
        }
        double deductions = grosspay-pay;
        System.out.println(givnam+" "+famnam+": \n\t"+grosspay+"\n\t"+deductions+"\n"
                + "\t"+pay);
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
