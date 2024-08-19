/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pithypasstimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PithyPasstimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int c = 0;
        for(int i = 0; i < N; i++){
            String str = input.next();
            if(str.length() <= 10){
                c++;
            }
        }
        System.out.println(c);       
    }  
}
