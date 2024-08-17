/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasspracticecccc2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class InClassPracticeCCCC2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
//            int X1 = str1.charAt(0); //this will store the ascii value of the str1.charAt(0) into X!
//            System.out.println(X1);
//            for(int i = 0; i<str1.length(); i++){
//                System.out.println(str1.charAt(i)+"\t"+(int)(str1.charAt(i)));
//            }
        //there are 255 ASCII Values
        //declare an integer array with the ize of 255
        //go through each char in the str1. 
        //update the index with the corresponding ascii value by 1 time
        int [] asciiArr = new int[255];
        for(int i = 0; i<str1.length(); i++){
            asciiArr[str1.charAt(i)]++;
        }
        //count th number of odd numbers in the asciiArr
        //and if that count is <=1 then str1 is a palindrome
        //else its not a palindrome
        int intOddCount = 0;
        for(int i = 0; i<255; i++){
            if(asciiArr[i]%2 !=0)intOddCount++;
        }
        if(intOddCount <= 1)System.out.println("YES");
        else System.out.println("NO");
        
    }
    
}
