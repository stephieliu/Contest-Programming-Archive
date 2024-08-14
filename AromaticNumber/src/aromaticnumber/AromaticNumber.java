/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aromaticnumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AromaticNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(); int tot = 0;
        for(int i=0; i<s.length(); i+=2){
            int a = s.charAt(i) - '0', r = getRoman(s.charAt(i+1)), ar = a*r;
            if(i + 3 < s.length() && getRoman(s.charAt(i+3)) > r) tot -= ar;
            else tot += ar;
        }
        System.out.println(tot);
    }
    static int getRoman(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        return 1000;
    }
}
