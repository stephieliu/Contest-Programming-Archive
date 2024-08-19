/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for(int i = 0; i<nTest; i++){
            String strWord = input.next();
            Map<String, Integer> myMap = new HashMap<String, Integer>();
            for(int  k = 0; k<=strWord.length();k++){
                for(int j = k+1; j<=strWord.length(); j++){
                    if(!myMap.containsKey(strWord.substring(k, j))){
                        myMap.put(strWord.substring(k, j), i);
                    }
                }
            }
            System.out.println(myMap.keySet().size()+1);
        }
    }
    
}
