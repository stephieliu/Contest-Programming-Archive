/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agegate1;

import java.io.*;
import java.util.*;
import java.time.*;

/**
 *
 * @author steph
 */
public class AgeGate1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static void findAge(int current_date, int current_month,
            int current_year, int birth_date,
            int birth_month, int birth_year) {
        int month[] = {31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};

        // if birth date is greater then current  
        // birth_month, then donot count this month 
        // and add 30 to the date so as to subtract  
        // the date and get the remaining days 
        if (birth_date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + month[birth_month - 1];
        }

        // if birth month exceeds current month,  
        // then do not count this year and add  
        // 12 to the month so that we can subtract 
        // and find out the difference 
        if (birth_month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }

        // calculate date, month, year 
        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;

        // print the present age 
//        System.out.println("Present Age");
        if(calculated_year>=13) System.out.println("old enough");
        else System.out.println("too young");
        System.out.println("Years: " + calculated_year
                + " Months: " + calculated_month + " Days: "
                + calculated_date);
    }
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<5; i++){
            int day = readInt(), month = readInt(), year = readInt();
            findAge(27, 10, 2010, day, month, year);
            
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
