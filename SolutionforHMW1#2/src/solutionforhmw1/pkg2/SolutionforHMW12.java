/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionforhmw1.pkg2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SolutionforHMW12 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strSen = input.nextLine();
        String strAlpha = "1234567890-=WERTYUIOP[]\\SDFGHJKL;XCVBNM,./";
        String strCorrect = "`1234567890-QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,.";
        String strTemp = "";
        for(int i = 0; i<strSen.length(); i++){
            if(strSen.charAt(i)==' '){
                strTemp = strTemp+" ";
            }
            else{
                int index = strAlpha.indexOf(strSen.charAt(i));
                strTemp = strTemp+strCorrect.charAt(index);
                
            }
        }
        System.out.println(strTemp);            
    }
    
}
