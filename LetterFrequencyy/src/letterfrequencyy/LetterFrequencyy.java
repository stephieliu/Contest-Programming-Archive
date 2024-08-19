/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterfrequencyy;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class LetterFrequencyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int Q = input.nextInt();
        for(int x = 0; x<Q; x++){
            int freq = 0, i = input.nextInt(), j = input.nextInt();
            char c = input.next().charAt(0);
            for(int y = i; y<=j; y++){
                if(s.charAt(y)!=' '){
                    if(s.charAt(y)== c){
                        freq++;
                    }
                }
            }
            System.out.println(freq);
        }
    }
    
}
