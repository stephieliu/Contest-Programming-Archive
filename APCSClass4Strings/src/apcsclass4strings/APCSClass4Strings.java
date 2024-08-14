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
public class APCSClass4Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = "Stephen Harper";
        String str2 = "a";
        String str3 = "1234";
        String str4 = "strphen.123@gov.ca";
        //finding he number of letters in a string
        //.length will return the number of letters in a string
        System.out.println(str1.length());
        //Finding a letter in a specified index
        System.out.println(str1.charAt(3));
        //Finding an index of a specified letter
        //indexOf always gives the first index of the char if found in the 
        //string
        //else it will return -1
        System.out.println(str1.indexOf("S"));
        System.out.println(str1.indexOf(" "));
        String strFun = "hen";
        System.out.println(str1.indexOf(strFun));
        




        String strFull = "Srimawo Ratwatte Banadaranakaye";
        //Question:
        //<First Middle Last>>
        //Using charAt() /indexOf()/length() and a loop
        //print Middle Last
        for(int i = strFull.indexOf(" "); i<strFull.length()-1; i++){
            System.out.print(strFull.charAt(i+1));
        }
        
        //substirngs
        System.out.println(str1.substring(2,5));
        System.out.println(str1.substring(1, 2));
        System.out.println(str1.substring(3));
        //generating all possible substrings:
        for(int i = 0; i<str1.length()-1; i++){
            for(int j = i; j<str1.length(); j++){
                System.out.println(str1.substring(i,j));
            }
        }
        
        //touppercase and tolowercase
        String s1 = "apple";
        String s2 = "APPLE";
        String s3 = "ApPlE";
        System.out.println(s1.toUpperCase());
        System.out.println("s1 "+s1);
        //toUpperCase() or toLowerCase() won't change the original string
        //it returns a new string
        
    }
    
}
