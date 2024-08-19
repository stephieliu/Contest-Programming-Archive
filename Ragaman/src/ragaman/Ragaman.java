/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragaman;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Ragaman {

    /**
     * @param args the command line arguments
     */
    private static String AnagramOrNot(){
        Scanner input = new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
        if(str1.length()==str2.length()){
            for(int i=0; i< str2.length(); i++){
                int x = str1.indexOf(str2.charAt(i));
                if(x!=-1&&str2.charAt(i)!='*'){
                    str1=str1.substring(0, x)+str1.substring(x+1, 
                        str1.length());
                }
                else if(str2.charAt(i)!='*'&& x==-1)
                    return "N";
            }
            return "A";
        }
        else
            return "N";
	}
    public static void main(String args[]){
        System.out.println(AnagramOrNot());
    }
//    //Another SOLUTION
//    public static void main(String arg[]){
//        Scanner input = new Scanner(System.in);
//        String str1 = input.next();
//        String str2 = input.next();
//        if(str2.contains("*")){
//            str2 = str2.replaceAll("*","");
//        }
//    }
    
//    public static void main(String[] args){
        //if str1 has all the non-asterisk characters that str2 has,
        //then count how many characters are missing from str1 (if there
        //are any) and if that is equal to the number of asterisks then
        //it is an anagram
//        Scanner input = new Scanner(System.in);
//        
//        String str1 = input.next();
//        String str2 = input.next();
//        int [] str = new int[str1.length()];
//        int asterisks = 0;
//        //count number of asterisks
//        for(int i = 0; i<str2.length(); i++){
//            if(str2.charAt(i)=='*'){
//                asterisks++;
//            }
//        }
//        
//        //check if it is already an anagram
//        int[]c = new int[128];
//        int[]d = new int[128];
//        for(int i = 0; i<str1.length(); i++){
//            if(str1.charAt(i) != ' '){
//            c[str1.charAt(i)]++;
//        }       
//        }
//        for(int j = 0; j<str2.length();j++){
//            if(str2.charAt(j) != ' '){
//            d[str2.charAt(j)]++;
//        }       
//        }
//        if(Arrays.equals(c,d)){
//            System.out.println("A");
//        }
//        else{
//            String str3 = str2.replaceAll("*","");
//            for(int i = 0; i<str1.length(); i++){
//                
//            }     
//        }

//        char[] char1 = input.nextLine().toCharArray();
//        char[] char2 = input.nextLine().toCharArray();
//        if(char1.length != char2.length){
//            System.out.println("N");
//        }
//        else{
//            for(char c : char1){
//                int count = 0, cnt = 0;
//                for(int i = 0; i < char1.length; i++){
//                    if(char1[i] == c)
//                        count += 1;
//                    if(char2[i] == c)
//                        cnt += 1;
//                }
//                if(count < cnt){
//                    System.out.println("N");
//                    break;
//                }
//                else{ 
//                    System.out.println("A"); 
//                    break;
//                }
//            }
//            
//        }
    }
//}
