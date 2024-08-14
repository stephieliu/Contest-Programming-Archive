/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetiri;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Cetiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] prog = new int [3];
        int [] diff = new int [2];
        int d = 0;
        for(int i = 0; i<3; i++){
            prog[i] = input.nextInt();
        }
        Arrays.sort(prog);
        int j = 1;
        for(int i = 0; i<2; i++){
            diff[i] = prog[j] - prog[j-1];
            j++;
        }
        if(diff[0]>diff[1]){
            d = diff[1];
            System.out.println(prog[0]+d);
        }
        else if(diff[0]<diff[1]){
            d = diff[0];
            System.out.println(prog[1]+d);
        }
        else{
            d = diff[0];
            System.out.println(prog[2]+d);
        }
    }
    
}
