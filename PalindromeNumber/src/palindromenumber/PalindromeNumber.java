/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PalindromeNumber {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String str){
        if(str.length()==1) return true;
        else if(str.length() == 2 && (str.charAt(0)==str.charAt(1))){
            return true;
        }
        else if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;
    }
    public static String reverse(String str){
        String strTemp = "";
        for(int i = str.length()-1; i>=0; i++){
            strTemp = strTemp + str.charAt(i);
        }
        return strTemp;
    }
    public static String DecitoBin(int n, int base){
        String strTemp = "";
        while(n>0){
            strTemp= strTemp+n%base;
        }
        return reverse(strTemp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i =2; i<=9; i++){
            if(isPalindrome(DecitoBin(x, i))){
                System.out.println(i);
            }
        }
    }

}
