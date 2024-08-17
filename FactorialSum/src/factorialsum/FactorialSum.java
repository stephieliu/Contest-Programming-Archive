/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialsum;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FactorialSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numb = 20;
        int n = 0;
        int i = 1;
        while(i<=numb){
            int factorial = 1;
            int j = 1;
            while(j<=i){
                factorial = factorial*j;
                j++;
            }
            n = n+factorial;
            i++;
        }
        System.out.println(n);
    }
    
}
