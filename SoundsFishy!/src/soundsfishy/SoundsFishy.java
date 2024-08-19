/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundsfishy;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SoundsFishy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        if(one<two&&two<three&&three<four){
            System.out.println("Fish Rising");
        }
        else if(one>two&&two>three&&three>four){
            System.out.println("Fish Diving");
        }
        else if(one==two&&two==three&&three==four){
            System.out.println("Fish At Constant Depth");
        }
        else{
            System.out.println("No Fish");
        }
   }
    
}
