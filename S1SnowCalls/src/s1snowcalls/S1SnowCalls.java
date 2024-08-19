/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1snowcalls;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class S1SnowCalls {

    /**
     * @param str1 is the original string
     * @param str2 is the string to be removed in str1
     * @return every str1 that is not str2
     */
    public static String replaceAll(String str1, String str2, String str3){
        int index = str1.indexOf(str2);
        while(index >=0){
            str1 = str1.substring(0,index)+str3+str1.substring(index+str2.length());
            index = str1.indexOf(str2);
        }
        return str1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nPhone = input.nextInt();
        for(int i = 0; i<nPhone; i++){
            String strPhone = input.next();
            strPhone = replaceAll(strPhone, "-","");
            for(int j = 0; j<strPhone.length(); j++){
                if(strPhone.charAt(j)=='A' || strPhone.charAt(j)=='B'|| 
                        strPhone.charAt(j)=='C'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"2");
                }
                if(strPhone.charAt(j)=='D' || strPhone.charAt(j)=='E'|| 
                        strPhone.charAt(j)=='F'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"3");
                }
                if(strPhone.charAt(j)=='G' || strPhone.charAt(j)=='H'|| 
                        strPhone.charAt(j)=='I'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"4");
                }
                if(strPhone.charAt(j)=='J' || strPhone.charAt(j)=='K'|| 
                        strPhone.charAt(j)=='L'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"5");
                }
                if(strPhone.charAt(j)=='M' || strPhone.charAt(j)=='N'|| 
                        strPhone.charAt(j)=='O'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"6");
                }
                if(strPhone.charAt(j)=='P' || strPhone.charAt(j)=='Q'|| 
                        strPhone.charAt(j)=='R'||strPhone.charAt(j)=='S'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"7");
                }
                if(strPhone.charAt(j)=='T' || strPhone.charAt(j)=='U'|| 
                        strPhone.charAt(j)=='V'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"8");
                }
                if(strPhone.charAt(j)=='W' || strPhone.charAt(j)=='X'|| 
                        strPhone.charAt(j)=='Y'|| strPhone.charAt(j)=='Z'){
                    strPhone = replaceAll(strPhone, strPhone.substring(j, j+1),"9");
                }
            }
            String Phone = strPhone.substring(0,3)+"-"+strPhone.substring(3,6)+"-"
                    +strPhone.substring(6,10);
            System.out.println(Phone);
        }
    }
    
}
