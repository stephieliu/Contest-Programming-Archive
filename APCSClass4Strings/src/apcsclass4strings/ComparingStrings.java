/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass4strings;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ComparingStrings {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String str1 = "Apple";
        String str2 = "Boy";
        String str3 = "Cat";
        String str4 = "Apple";
        //Comparing string for equality
        if(str1.equals(str4)){
            System.out.println(str1+" is the same as "+str4);
        }
        if(!str1.equals(str2)){
            System.out.println(str1+" is not the same as "+str2);
        }
        if(str1.compareTo(str4)==0){
            System.out.println(str1+" is the same as "+str4);
        }
        if(str1.compareTo(str2)<0){
            System.out.println(str1+" come first in the dictionary "
                    + "than "+str2);
        }
        if(str2.compareTo(str1)>0){
            System.out.println(str2+" come later in the dictionary "
                    + "than "+str1);
        }
        //Accessing the ascii values
        //Declaring a char
        char x1 = 'A';
        char x2 = 'B';
        String strFun = "Apple";
        //comparing two char values
        if(x1==strFun.charAt(0)){
            System.out.println("strFun begins with "+x1);
        }
        //Accessinf the ascii values
        int y1 = x1;//when a char is assigned to an integer, the integer
        //will store the ascii value of the char
        System.out.println(y1);
        //convert back to a letter
        x1 = (char)(y1+3);
        System.out.println(x1);
        
    }
}
