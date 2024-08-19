/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictrick;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            int N = input.nextInt();//number of cards
            ArrayList <Integer> cards = new ArrayList<>();
            ArrayList <Integer> greater = new ArrayList<>();
            for(int j = 0; j<N; j++){
                cards.add(j+1);
            }
            Collections.reverse(cards);
            boolean yes = true;
            for(int j = 0; j<N; j++){
                int number = input.nextInt();
                if(number >= cards.size()){
                    yes = false;
                    break;
                }
                greater.add(cards.get(number));
                cards.remove(number);
            }
            if(yes){
                for(int j = 0; j<greater.size(); j++){
                    int number = greater.get(j);
                    System.out.print(number+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
    }
    
}
