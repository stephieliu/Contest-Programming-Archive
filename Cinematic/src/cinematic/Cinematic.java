/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematic;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Cinematic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(), Y = input.nextInt();
        String [] arr = new String [N];
        HashMap<String, Integer> movies = new HashMap<>();
        double price = 0;
        for(int i = 0; i<N; i++){
            arr[i] = input.next();
        }
        for(int i = 0; i<N; i++){
            movies.put(arr[i], input.nextInt());
        }
        for(int i = 0; i<Y; i++){
            String movie = input.next();
            if(movies.containsKey(movie)){
                price += movies.get(movie);
                movies.remove(movie);
            }
        }
        System.out.println(Math.round(price));
    }
    
}
