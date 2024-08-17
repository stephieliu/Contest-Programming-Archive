/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hapaxlegomenon;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HapaxLegomenon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Map <String, Integer> words = new HashMap();
        for(int i = 0; i<N; i++){
            String word = input.nextLine();
            words.put(word, 1+words.getOrDefault(word,0));
        }
        int count = 0;
        for(String w: words.keySet()){
            if(words.get(w)==1){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
