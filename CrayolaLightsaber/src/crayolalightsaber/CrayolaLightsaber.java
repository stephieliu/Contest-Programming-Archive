/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crayolalightsaber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CrayolaLightsaber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int numb = input.nextInt();
//        int count = 1;
//        String [] markers = new String [numb];
//        for(int j = 0; j<numb; j++){
//            String colour = input.next();
//            if(!" ".equals(colour)){
//                markers[j] = colour;
//            }
//        }
//        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int max = 0;
        HashMap<String, Integer> mp = new HashMap<>();
        //store in a map
        for(int i = 0; i < N; i++){
            String colour = input.next();
            mp.put(colour, mp.getOrDefault(colour, 0)+1);
            max = Math.max(max, mp.get(colour));
        }
        int other = N - max; 
        if(other < max - 1){
            System.out.println(other + other + 1);
        }
        else{
            System.out.println(N);
        } 
    }
    
}
