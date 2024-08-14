/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aromaticnumbers;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AromaticNumbers {

    /**
     * @param args the command line arguments
     */
    public static int getRoman(char x){
        if(x=='I') return 1;
        else if(x=='V') return 5;
        else if(x=='X') return 10;
        else if(x=='L') return 50;
        else if(x=='C') return 100;
        else if(x=='D') return 500;
        else if(x=='N') return 1000;
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strRoman = input.next();
        int value = 0;
        int r = 9999;
        int s = 0;
        for(int i =0; i<strRoman.length(); i+=2){
            String A = strRoman.substring(i, i+1);//numerical value
            String R = strRoman.substring(i+1, i+2);//roman value
            int t = getRoman(R.charAt(0))*Integer.parseInt(A);
            value = value+t;
            if(r<getRoman(R.charAt(0))){
                value = value-2*s;
            }
            r = getRoman(R.charAt(0));
            s = t;
        }
        System.out.println(value);
    }
    
}
