/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapdemo;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //declaring a map to store string, integer pair
        Map<String, Integer> myMap = new HashMap<>();
        for(int i = 0; i<sentence.length(); i++){
            //Putting an element into the map
            if(!sentence.substring(i, i+1).equals(" "));
            if(myMap.containsKey(sentence.substring(i, i+1))){
                //containsKey will return true if the key exists in the map
                //else return false
                myMap.put(sentence.substring(i, i+1), 
                        myMap.get(sentence.substring(i, i+1))+1);
                //myMap.get(key) will return the value 
                //associated with the key
            }
            else{
                myMap.put(sentence.substring(i, i+1),1);
            }
        }
        int intmax = 0;
        String mostFre = "";
        
        //printing the keys along with the values.
        for(String K : myMap.keySet()){
            if(myMap.get(K)>= intmax){
                intmax = myMap.get(K);
                mostFre = K;
            }
            //myMap.keySet will return an array of all the keys
            System.out.println(K+ "\t"+myMap.get(K));
            System.out.println(mostFre);
        }
    }
    
}
