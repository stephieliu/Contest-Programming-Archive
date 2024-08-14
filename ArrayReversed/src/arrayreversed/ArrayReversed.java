/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreversed;

/**
 *
 * @author Stephie
 */
import java.util.Random;
import java.util.Arrays;
public class ArrayReversed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int min = 1;
        int max = 100;
        int num = 0;

        for(int i = 0;i<10;i++){
           array[i] = (int) (Math.floor(Math.random()*(max-min+1))+min);
        }
        for(Integer number : array){
           System.out.println(Arrays.toString(array));
           break;
        }
        for(int counter = 9;counter>=0;counter--){
            int Last = array[counter];
            System.out.print(Last + " ");
        }
    }   
}
