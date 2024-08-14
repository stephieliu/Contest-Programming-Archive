/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12hmk.q4;

import java.util.Scanner;

/**
 *
 * @author Stephie
 */
public class Class12HmkQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        palindrome();
    }
    public static void palindrome(){
        Scanner input = new Scanner(System.in);
        for(;;){
            System.out.print("Enter a string: ");
            String s = input.nextLine();
            int rand = s.length();
            boolean isPalindrome = false;
            if(rand == 1){
                isPalindrome = true;
            }
            else if(rand%2==0){
                for(int i = 0;i<rand/2;i++){
                    if(s.charAt(i) == s.charAt(rand-1-i)){
                        isPalindrome = true;   
                    }
                    else{
                        isPalindrome = false;
                    }
                }
            }
            else{
                for(int i = 0;i<rand/2;i++){
                    if(s.charAt(i) == s.charAt(rand-1-i)){
                        isPalindrome = true;   
                    }
                    else{
                        isPalindrome = false;
                    }                    
                }
            }
            if(isPalindrome){
                System.out.println("Yup, that's a palindrome!");
            }
            else{
                System.out.println("Nope, that's not a palindrome...");
            }
        }
    }
}
