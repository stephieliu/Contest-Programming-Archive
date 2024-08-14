/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package cardgame;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A=0, B=0;
        for(int i = 0; i<52; i++){
            String turn = input.next();
            if(turn.equals("ace")&&52-i>3){
                if(i%2==1){
                    System.out.println("Player A scores 4 point(s).");
                    A+=4;
                }
                else{
                    System.out.println("Player B scores 4 point(s).");
                    B+=4;
                }
            }
            else if(turn.equals("king")&&52-i>2){
                if(i%2==1){
                    System.out.println("Player A scores 3 point(s).");
                    A+=3;
                }
                else{
                    System.out.println("Player B scores 3 point(s).");
                    B+=3;
                }
            }
            else if(turn.equals("queen")&& 52-i>1){
                if(i%2==1){
                    System.out.println("Player A scores 2 point(s).");
                    A+=2;
                }
                else{
                    System.out.println("Player B scores 2 point(s).");
                    B+=2;
                }
            }
            else if(turn.equals("jack")&&52-i>0){
                if(i%2==1){
                    System.out.println("Player A scores 1 point(s).");
                    A+=1;
                }
                else{
                    System.out.println("Player B scores 1 points(s).");
                    B+=1;
                }
            }
            System.out.println("Hi");
            System.out.println("Wheee");
        }
        System.out.println("Player A: "+A+" point(s).");
        System.out.println("Player B: "+B+" point(s).");
    }
    
}
