/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicewithstrings;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class practicewithstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //create a string
//        String x = "Stephie";
//        for(int i = 0; i<=x.length(); i++){
//            if(i%2==0){
//                System.out.println(x.charAt(i));
//            }
//        }
        //x.substring(1,3);
        //this substring method will print out all characters from 
        //position 1 to position 3-1
        //the original string DOESN'T CHANGE
        //substring (3,3) will give nothing
        //substring (4,2) will give error
        String text = "abcd";
        //generate all the substrings
        for(int i = 0; i<text.length(); i++){
            for(int j = i+1; j<=text.length(); j++){
                System.out.println(text.substring(i,j));
            }
        }
//        
//        String str = "abcdefg";
//        String substr = "de";
//        str.indexOf(substr);//returns first position substr occurs in str
//        //it will return 3 in this case
//        //if substr doesn't occur, it will say -1.
//        //it is case sensitive
//        str.indexOf(substr, 1);//returns first position of substr starting from
//        //index 1
//        
//        //output number of itmes abc appears
//        String txt = "aabcdabcddabcabcd";
//        int count = 0, start=0;
//        while(true){
//            int p = txt.indexOf("abc", start);
//            if(p==-1)break;
//            count++; start = p+1;
//        }
//        System.out.println(count);
//        How to get ASCII value:
//        System.out.println((int)'A');
//        String Str1 = "Java";
//        String Str2 = "Jon";
//        System.out.println(Str1+Str2);// Will return "JavaJon";
        
    }
    
}
