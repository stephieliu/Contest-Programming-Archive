/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forgetmenot;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ForgetMeNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String T = input.next();
        if(S.length()>T.length()){
            for(int i = 0;i<S.length();i++){
                if(S.charAt(i)>T.charAt(i) && i==S.length()-1){
                    System.out.println("S");
                }
                else if(S.charAt(i)<T.charAt(i) && i==T.length()-1){
                    System.out.println("T");
                }
            }
        }
        
        else if(S.length()<T.length()){
            for(int i = 0;i<T.length();i++){
                if(S.charAt(i)>T.charAt(i) && i==T.length()-1){
                    System.out.println("S");
                }
                else if(S.charAt(i)<T.charAt(i) && i==T.length()-1){
                    System.out.println("T");
                }
            }
        }
    }
    
}
