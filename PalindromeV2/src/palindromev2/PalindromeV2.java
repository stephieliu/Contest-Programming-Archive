/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromev2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PalindromeV2 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String str){
        if(str.length()==1) return true;
        else if(str.length() == 2 && (str.charAt(0)==str.charAt(1))){
            return true;
        }
        else if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;
    }
    public static int Base11ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='A'){
                intTotal = intTotal+10*(int)(Math.pow(11, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(11, exp));                
            }
            exp++;
        }
        return intTotal;
    }
    public static int Base12ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='A'){
                intTotal = intTotal+10*(int)(Math.pow(11, exp));
            }
            else if(str.charAt(i)=='B'){
                intTotal = intTotal+10*(int)(Math.pow(12, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(12, exp));                
            }
            exp++;
        }
        return intTotal;    
    }
    public static int Base13ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='C'){
                intTotal = intTotal+10*(int)(Math.pow(13, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(13, exp));                
            }
            exp++;
        }
        return intTotal; 
    } 
    public static int Base14ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='C'){
                intTotal = intTotal+10*(int)(Math.pow(14, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(14, exp));                
            }
            exp++;
        }
        return intTotal;     }
    public static int Base15ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='D'){
                intTotal = intTotal+10*(int)(Math.pow(15, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(15, exp));                
            }
            exp++;
        }
        return intTotal; 
    }
    public static int Base16ToTen(String str){
        int exp = 0;
        int intTotal = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='E'){
                intTotal = intTotal+10*(int)(Math.pow(16, exp));
            }
            else{
                intTotal = intTotal
                        +Integer.parseInt(str.substring(i, i+1))*
                        (int)(Math.pow(16, exp));                
            }
            exp++;
        }
        return intTotal; 
    }
    public static String DeciTo11(int n,int base){
        String strTemp = "";
        while(n>0){
            int r = n % base;
            if(base==11){
                if(r==10)strTemp = strTemp+"A";
                else strTemp = strTemp+r;
            }
            else if(base==12){
                if(r==10)strTemp = strTemp+"A";
                else if(r==11)strTemp = strTemp+"B";
                else strTemp = strTemp+r;
            }
            else if(base==13){
                if(r==10)strTemp = strTemp+"A";
                else if(r==11)strTemp = strTemp+"B";
                else if(r==12)strTemp = strTemp+"C";
                else strTemp = strTemp+r;
            }
            else if(base==14){
                if(r==10)strTemp = strTemp+"A";
                else if(r==11)strTemp = strTemp+"B";
                else if(r==12)strTemp = strTemp+"C";
                else if(r==13)strTemp = strTemp + "D";
                else strTemp = strTemp+r;
            }
            else if(base==15){
                if(r==10)strTemp = strTemp+"A";
                else if(r==11)strTemp = strTemp+"B";
                else if(r==12)strTemp = strTemp+"C";
                else if(r==13)strTemp = strTemp + "D";
                else if(r==14)strTemp = strTemp+"E";
                else strTemp = strTemp+r;
            }
            else if(base==16){
                if(r==10){
                    
                }
            }
            n = n/base;
        }
        return reverse(strTemp);
    
    }
    public static String reverse(String str){
        String strTemp = "";
        for(int i = str.length()-1; i>=0; i++){
            strTemp = strTemp + str.charAt(i);
        }
        return strTemp;
    }
    public static int reverseSum(int n){
        int intTotal =0;
        int intTemp = n;
        String str = Integer.toString(n);
        int index = str.length()-1;
        while(n>0){
            intTotal = intTotal + (n%10)*(int)(Math.pow(10, index));
            n = n/10;
            index--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strNum = input.next();
        int intBase = input.nextInt();
        int intCount = 0;
        while(!isPalindrome(strNum)){
            intCount++;
            if(intBase == 11){
                int y = Base11ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 11);
            }
            else if(intBase == 12){
                int y = Base12ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 12);
            }
            else if(intBase == 13){
                int y = Base13ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 13);
            }
            else if(intBase == 14){
                int y = Base14ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 14);
            }
            else if(intBase == 15){
                int y = Base15ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 15);
            }
            else if(intBase == 16){
                int y = Base16ToTen(strNum);
                int z= reverseSum(y);
                strNum = DeciTo11(z, 16);
            }
        }
        if(intCount <10){
            System.out.println(strNum);
        }
        else{
            System.out.println("None");
        }
    }
    
}
