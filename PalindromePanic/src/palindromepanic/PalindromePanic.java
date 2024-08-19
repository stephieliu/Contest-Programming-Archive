/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromepanic;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PalindromePanic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int addon=0;
        boolean Palindrome= true;
        for (int i = 0; i<10; i++){
            int [] palindrome = new int [str.length()];
            for(int j = 0; j<str.length(); j++){
                palindrome [j] = str.charAt(j);
                if(str.charAt(str.length()+j) == str.charAt(j)){
                    if(str.length()+j == j){
                        Palindrome = true;
                        addon = 0;
                    }
                }
                else{
                    Palindrome = false;
                    addon = j;
                    break;
                }
            }
        }
        if(Palindrome == true){
            System.out.println("0");
        }
        else{
            System.out.println(addon);
        }
        
    }
    
}
