/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenpalindrome;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HiddenPalindrome {

    /**
     * @param str1
     * @return 
     */
    public static boolean Palindrome(String str1){
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        int most = 0;
        for(int i = 0; i<str1.length(); i++){
            for(int j = i; j<str1.length(); j++){
                if(Palindrome(str1.substring(i, j+1))){
                    most = Math.max(most, j-i+1);
                }
            }
        }
        System.out.println(most);
    }
    
}
