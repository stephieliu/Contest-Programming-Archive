/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdosnumbers;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class ErdosNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scenarios = input.nextInt();
        for(int i = 0; i<scenarios; i++){
            int P = input.nextInt();
            int N = input.nextInt();
            String author, authors;
            Map<Integer, String>myMap = new HashMap<>();
            Map<Integer, String>myMap1 = new HashMap<>();
            for(int j = 0; j<P; j++){
                myMap.put(j, input.next());
            }
            for(int j = 0; i<N; j++){
                myMap1.put(j, input.next());
            }
            System.out.println("Scenario " + i+1);
            for(int K1 : myMap1.keySet()){
                author = myMap1.get(K1);
                for(int K : myMap.keySet()){
                    authors = myMap.get(K);
                    for(int j = 0; j<authors.length(); j++){                       
                        if(!(":").equals(authors.charAt(j))){
                            
                        }
                    }
                }
            }
        }
    }
    
}
