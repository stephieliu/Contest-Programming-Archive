/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeontask;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TimeOnTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();//number of minutes to complete chores
        int C = input.nextInt();//number of chores
        int [] chores = new int[C];
        for(int i = 0; i<C; i++){
            chores[i] = input.nextInt();
        }
        Arrays.sort(chores);
        int count = 0;
        for(int i = 0; i<C; i++){
            T = T-chores[i];
            if(T < 0){
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
    
}
