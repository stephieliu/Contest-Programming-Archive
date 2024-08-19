/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleencryption;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyword = input.nextLine();
        String Emessage = input.nextLine();
        String ans = "";
        int index = 0;
        for(int i = 0;i<Emessage.length(); i++){
            char c = Emessage.charAt(i);
            if(c>='A'&&c<='Z'){
                int t= keyword.charAt(index%keyword.length()) - 'A'+c;
                if(t>'Z'){
                    t-=26;
                }
                ans +=(char)t; index++;
            }
        }
        //REGEX CODING
//        String a = "abksjn398rklc[]kjnaisd";
//        a.replaceAll("[a-z]","");
        System.out.println(ans);
    }
    
}