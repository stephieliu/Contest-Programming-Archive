/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class Method4 {
    static void toPigLatin(String input){
        int index = 0;
        for(int i = 1; i<input.length(); i++){
            if(input.charAt(i)==' '){
                Conversion(input.substring(0,i));
                index = i;
            }
        }
    }//test case: I am fluent in Pig Latin
    static void Conversion(String input){
        char a = input.charAt(0);
        if(input.length()==1){
            System.out.print(input+"yay ");
        }
        else if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.print(input+"yay ");
        }
        else{
            int index = -1;
            for(int i = 0; i<input.length(); i++){
                a = input.charAt(i);
                if(a == 'a' || a == 'e' || a == 'i' || a == 'o' 
                        || a == 'u'){
                    index = i;
                    break;
                }
            }
            for(int i = index; i<input.length(); i++){
                System.out.print(input.charAt(i));
            }
            for(int i = 0; i<index; i++){
                System.out.print(input.charAt(i));
            }
            System.out.print("yay ");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine().toLowerCase();
        toPigLatin(x);
    }
}
