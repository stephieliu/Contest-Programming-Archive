/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwaysort;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class RailwaySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cars = input.nextInt();
        int [] train = new int [cars];
        for(int i = 0; i<cars; i++){
            train [i] = input.nextInt();
        }
        for(int i = 0; i<cars; i++){
            if(train[i]<train[i+1]){
                train[i+1]= train[i];
                train[i] = train[i+1];
                int cost=0;
                cost++;
                System.out.print(cost);
            }    
        }
    }
    
}
