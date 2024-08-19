/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moregermannouns;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MoreGermanNouns {

    /**
     * @param args is a String variable
     * return a string where all the punctuation are being removed
     */
    public static String removePunc(String str){
        String punctuation = ",.?!//";
        String strTemp = "";
        for(int i = 0;i<str.length(); i++){
            if(punctuation.indexOf(str.charAt(i))==-1){
                strTemp = strTemp+str.charAt(i);
            }
        }
        return strTemp; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(removePunc("hel?.,lo;"));
//        int n = input.nextInt();
//        String GermanNouns = " ";
//        for(int i = 0; i<n; i++){
//            String[] GermanText = new String[n];
//            GermanText[i] = "((?<=\\s)[A-Z][\\w]*\\s)+[A-Z][\\w]*(?=\\s)";
//            GermanText[i] = GermanNouns+"\n";
//        }
//        System.out.println(GermanNouns);
    
        int nLines = input.nextInt();
        String strSen = input.nextLine();
        for(int i = 0; i<nLines; i++){
            strSen = input.nextLine();
            //the red cat sat on the mat!
            //split the sentence using white space
            String [] strArray = strSen.split(" ");
            //go through each word
            for(int j = 0; j<strArray.length; j++){
                if(strArray[j].substring(0, 1).toUpperCase().
                        equals(strArray[j].substring(0, 1)))
                    System.out.println(strArray[j]);
            }
        }
    }
    
}
