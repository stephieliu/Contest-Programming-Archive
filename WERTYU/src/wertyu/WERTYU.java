/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wertyu;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class WERTYU {

    /**
     * @param args the command line arguments
     */
//    public static String replaceAll(String str1, String str2, String str3){
//        int index = str1.indexOf(str2);
//        while(index >=0){
//            str1 = str1.substring(0,index)+str3+str1.substring(index+str2.length());
//            index = str1.indexOf(str2);
//        }
//        return str1;
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1= input.next();
        for(int i = 0; i<str1.length(); i++){
            str1 = str1.replaceAll("B","V");
            str1 = str1.replaceAll("C","X");
            str1 = str1.replaceAll("D","S");
            str1 = str1.replaceAll("E","W");
            str1 = str1.replaceAll("F","D");
            str1 = str1.replaceAll("G","F");
            str1 = str1.replaceAll("H","G");
            str1 = str1.replaceAll("I","U");
            str1 = str1.replaceAll("J","H");
            str1 = str1.replaceAll("K","J");
            str1 = str1.replaceAll("L","K");
            str1 = str1.replaceAll("M","N");
            str1 = str1.replaceAll("N","B");
            str1 = str1.replaceAll("O","I");
            str1 = str1.replaceAll("P","O");
            str1 = str1.replaceAll("R","E");
            str1 = str1.replaceAll("S","A");
            str1 = str1.replaceAll("T","R");
            str1 = str1.replaceAll("U","Y");
            str1 = str1.replaceAll("V","C");
            str1 = str1.replaceAll("W","Q");
            str1 = str1.replaceAll("X","Z");
            str1 = str1.replaceAll("Y","T");
            str1 = str1.replaceAll("//",".");
            str1 = str1.replaceAll(",","M");
            str1 = str1.replaceAll(".",",");
            str1 = str1.replaceAll("=","-");
            str1 = str1.replaceAll("-","0");
            str1 = str1.replaceAll("0","9");
            str1 = str1.replaceAll("9","8");
            str1 = str1.replaceAll("8","7");
            str1 = str1.replaceAll("7","6");
            str1 = str1.replaceAll("6","5");
            str1 = str1.replaceAll("5","4");
            str1 = str1.replaceAll("4","3");
            str1 = str1.replaceAll("3","2");
            str1 = str1.replaceAll("2","1");
            str1 = str1.replaceAll("1","`");
            str1 = str1.replaceAll("'",";");
            str1 = str1.replaceAll("]","[");
            str1 = str1.replaceAll("[","P");
            str1 = str1.replaceAll("\\","]");
        }
        System.out.println(str1);
    }
    
}
