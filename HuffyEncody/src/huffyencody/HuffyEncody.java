/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffyencody;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HuffyEncody {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String strl ="bbccaa";
//        System.out.println(strl.indexOf("aa"));
//        String str2 = "aaaabbcc";
//        System.out.println(str2.startsWith("aaaa"));
        int nEncode = input.nextInt();
        String [] Letter = new String[nEncode];
        String [] Encode = new String[nEncode];
        for(int i = 0; i<nEncode; i++){
            Letter[i] = input.next();
            Encode[i] = input.next();
        }
        String binary = input.next();
        String strTemp = "";
        while(binary.length()>0){
            int i = 0;
            while(!binary.startsWith(Encode[i])){
                i++;
            }
            strTemp = strTemp+Letter[i];
            binary =  binary.substring(Encode[i].length());
        }
        System.out.println(strTemp);
    }   
}