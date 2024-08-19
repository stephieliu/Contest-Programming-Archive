/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occupyparking;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class OccupyParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String yesterday = input.next();
        String today = input.next();
        int spaces = 0;
        for(int i = 0; i<N; i++){
            char y = yesterday.charAt(i);
            char t = today.charAt(i);
            if(t=='C'&&y=='C'){
                spaces++;
            }
        }
        System.out.println(spaces);
    }
    
}
