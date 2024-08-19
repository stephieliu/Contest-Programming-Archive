/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsandmaps;
/**
 *
 * @author Stephie
 */
import java.util.*;
public class SetsAndMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sets are unordered and have no duplicates
        //use it to find how many distinct values there are
        //set has:
        //size(); isEmpty(); contains(); add(); remove(); iterator();
        //implementation:
        //four types of sets
        //HashSet is best for most purposes; all the keys are not sorted; it is faster than treeset
        //TreeSet guarantees that all the keys are sorted from sallest to largest
        //LinkedHashSet is sorted according to what is inserted first
        //AbstractSet is not very common; it helps with new implementations
        int a [] = {5, 4, 2, 1, 4, 2, 4, 5};
        Set <Integer> s = new HashSet();
        for(int x:a){
            s.add(x);
        }
        System.out.println("# of distinct numbers: "+s.size());
        for(int x: s){
            System.out.print(x+" ");
        }
        System.out.println();
        if(s.contains(4)){
            System.out.println("Contains number "+ 4);
        }
        s.remove(4);
        System.out.println(s);
        
        
        
        //Maps
        //maps cannot contain duplicates
        //each key can map to at most one value
        //ex: dictionary, phone book
        //Hashmap: faster, not sorted
        //Treemap: slower but sorted
        //Operations:
        //put(key,value); get(key); remove(key); containsKey(key); containsValue(value); size(); isEmpty();
        //if you put(key, value) and it already exists, it replaces the existing value;
        Map<String, Integer> myMap = new HashMap();
        String [] words = {"hello","world","hello","hi","java","hi","java","world","hello"};
        for(int i = 0; i<words.length;i++){
            myMap.put(words[i], 1+myMap.getOrDefault(words[i],0));
        }
        System.out.println("size of map: "+myMap.size());
        for(String word:myMap.keySet()){
            System.out.println(word +" : "+myMap.get(word));
        }
    }
    
}
