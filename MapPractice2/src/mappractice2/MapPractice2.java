/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappractice2;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class MapPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strsen = input.nextLine();
        String [] strArr = strsen.split(" ");
        //return a string array where words are split by a white space
        Map<String, Integer>myMap = new HashMap<String, Integer>();
        for(int i = 0; i<strArr.length; i++){
            if(myMap.containsKey(strArr[i])){
                myMap.put(strArr[i], myMap.get(strArr[i])+1);
            }
            else{
                myMap.put(strArr[i], 1);
            }
        }
        int mostFreq = 0;
        String FreWord = "";
        for(String K: myMap.keySet()){
            if(myMap.get(K)>mostFreq){
                mostFreq = myMap.get(K);
                FreWord=K;
            }
        }
        System.out.println(FreWord);
    }
    
}
