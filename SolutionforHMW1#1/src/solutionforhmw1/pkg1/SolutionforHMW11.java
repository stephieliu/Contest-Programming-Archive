/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionforhmw1.pkg1;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SolutionforHMW11 {

    public static boolean isPalindrome(String str1){
        String strReverse="";
        for(int i = str1.length()-1; i>=0;i++){
            strReverse = strReverse+str1.charAt(i);
        }
        return str1.equals(strReverse);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strWord = input.next();
        String strTemp ="";
        int intLongest = 0;
        for(int i = 0; i<=strWord.length(); i++){
            for(int j = (i+1); j<=strWord.length();j++){
                if(isPalindrome(strWord.substring(i,j))){
                    if(strWord.substring(i,j).length()>intLongest){
                    intLongest = strWord.substring(i,j).length();
                    strTemp = strWord.substring(i,j);
                    }
                }
            }
            
        }
            System.out.println(strTemp.length());
    }
    
}
