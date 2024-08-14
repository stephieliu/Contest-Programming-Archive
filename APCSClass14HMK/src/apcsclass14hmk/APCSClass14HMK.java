/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass14hmk;

/**
 *
 * @author steph
 */
import java.util.*;
public class APCSClass14HMK {

    /**
     * @param args the command line arguments
     */
    public static String scrambleWord(String word){
        for(int i = 0; i<word.length()-1; i++){
            if(word.charAt(i)=='A' && word.charAt(i+1)!='A'){
                word = word.substring(0,i)+word.charAt(i+1)
                        + word.charAt(i)+word.substring(i+2);
                i++;
            }
        }
        return word;
    }
    public static void scrambleOrRemove(List<String> wordList){
        for(int i = 0; i<wordList.size(); i++){
            if(!scrambleWord(wordList.get(i)).equals(wordList.get(i))){
                wordList.set(i, scrambleWord(wordList.get(i)));
            }
            else{
                wordList.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args){
        System.out.println(scrambleWord("TAN"));
        //should print TNA
        System.out.println(scrambleWord("EGGS"));
        //gives EGGS
        List<String> strWordList = new ArrayList<String>();
        strWordList.add("TAN");
        strWordList.add("ABRACADABRA");
        strWordList.add("APPLE");
        strWordList.add("EGGS");
        strWordList.add("WHOA");
        scrambleOrRemove(strWordList);
        System.out.println(strWordList);
        
        //removes WHOA and EGGS
    }
}
