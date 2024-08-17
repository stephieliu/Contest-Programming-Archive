/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Hearth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//number of cards
        int T = input.nextInt();//amount of mana crystals
        Map <String, Integer> cards = new TreeMap<>();
        int [] arr = new int [N];
        for(int i = 0; i<N; i++){
            String name = input.next();
            int value = input.nextInt();
            cards.put(name, value);
            arr[i] = value;
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<3;i++){
            if(T>0){
                T -= arr[count];
                count++;
                System.out.println(cards.)
            }
            
        }
    }
    
}
