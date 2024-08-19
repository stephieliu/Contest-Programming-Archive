/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicestringsarraystochararraymethods;

/**
 *
 * @author steph
 */
import java.util.*;
public class PracticeStringsArraystoCharArrayMethods {

    /**
     * @param args the command line arguments
     */
    public static String replaceNum(String s){
        return s.replaceAll("1", "one");
    }
    
    public static int letterOfInterest(String s, String letter){
        String [] arr = s.split(letter);
        return arr.length-1;
    }
    
    public static String reverse(String s){
        String temp = "";
        for(int i = s.length()-1; i>=0; i--){
            temp+=s.charAt(i);
        }
        return temp;
    }
    
    public static String antiVowel(String s){
        return s.toLowerCase().replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
    }
    
    public static String lowerCaseLetter(){
        String [] s = {"a", "b", "c", "d"};
        return s[(int)(Math.floor(Math.random()*(4)))];
    }
    
    public static int digit(){
        int [] i = {2, 5, 7, 9};
        return i[(int) (Math.floor(Math.random() * (4)))];
    }
    
    public static String upperCaseLetter(){
        String [] s = {"W", "X", "Y", "Z"};
        return s[(int)(Math.floor(Math.random()*(4)))];
    }
    
    public static String symbol(){
        String [] s = {"!", "~", "&", "@", "*", "%", "_"};
        return s[(int) (Math.floor(Math.random()*(7)))];
    }
    
    public static String changeString(String s){
        if(s.indexOf("not") == -1 || s.indexOf("poor")<s.indexOf("not")){
            return "Error. Conditions are not met";
        }
        return s.substring(0, s.indexOf("not")) + "good" + s.substring(s.indexOf("poor")+4, s.length());
    }
    
    public static String checkPassword(String s){
        for(int i = 0; i<s.length(); i++){
            String a = s.substring(i, i+1);
            for(int j = 0; j<s.length(); j++){
                String b = s.substring(j, j+1);
                if(a.equals(b) && i != j)//same character
                    return "bad password";
            }
        }
        return "good password";
    }
    
    public static String spellCheck(String s){
        String [] english = {"marine", "dimension", "equinox", "robot", "infinite", "dragon", "unity", "judgment", "canadian", "forestry", "classroom", "rainbow", "hope", "shift", "quest", "elite", "achieve", "loyalty", "legendary", "word", "goat", "leader", "avenue", "straw", "glue", "offense", "dine", "coal", "minute", "socialist", "judicial", "gradual", "throne", "hook", "graze", "sermon", "still", "pie", "exemption", "worth", "queue", "record", "crackpot", "departure", "pawn", "corn", "publisher", "degree", "air", "crime"};
        String [] words = s.split(" ");
        String result = "";
        
        //check if each word exists
        boolean exists = false;
        for (String word : words) {
            word = word.trim().replaceAll(".", "").toLowerCase();
            for (String english1 : english) {
                exists = word.equals(english1);
                if (exists) {
                    result += word;
                    break;
                }
            }
            if (!exists) {
                result += capitalise(word);
            }
        }
        
        System.out.println(result);
        
        //check if sentences are capitalized
        String [] sentences = result.split(".");
        result = "";
        for(int i = 0; i<sentences.length; i++){
            sentences[i] = sentences[i].substring(0, 1).toUpperCase();
            result += sentences[i];
        }
        System.out.println(result);
        return result;
    }
    
    public static String capitalise(String s){
        return s.toUpperCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //toCharArray()
        //1.
//        System.out.println("Enter a String.");
//        System.out.println(replaceNum(sc.nextLine()));
        
        //2.
//        System.out.println("Enter a string.");
//        String s = sc.nextLine();
//        System.out.println("Enter a letter.");
//        String letter = sc.nextLine();
//        System.out.println(letterOfInterest(s, letter));
        
        //You Decide
        //7.
//        System.out.println("Enter a string.");
//        System.out.println(reverse(sc.nextLine()));
        
        //8.
//        System.out.println("Enter a string.");
//        System.out.println(antiVowel(sc.nextLine()));
        
        //9.
//        System.out.println(lowerCaseLetter()+digit()+upperCaseLetter()+symbol());
        
        //10.
//        System.out.println("Enter a string.");
//        System.out.println(changeString(sc.nextLine()));
        
        //Challenge
        //11.
//        System.out.println("Enter a password.");
//        System.out.println(checkPassword(sc.nextLine()));
        
        //12.
        System.out.println("Enter a string.");
        System.out.println(spellCheck(sc.nextLine()));

        sc.close();
    }
    
}
