/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnext;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class JNEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int temp=0;
        int [] digits;
        for(int i = 0; i<cases; i++){
            int d = input.nextInt();
            digits = new int [d];
                for(int y = 0;y<d;y++){
                    digits[y] = input.nextInt();
                }
            for(int x = 0; x <= digits.length; x++){
                if(digits[digits.length-x]>digits[digits.length-x-1]){
                    digits[digits.length-x] = temp;
                    digits[digits.length-x]=digits[digits.length-x-1];
                    temp = digits[digits.length-x-1];
                }
            }
            System.out.print(digits);
        }
    }
    
}
