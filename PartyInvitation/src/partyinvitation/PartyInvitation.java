/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partyinvitation;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PartyInvitation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        int [] list = new int[h];
        int [] array = new int[m];
        for(int i = 0; i<h; i++){
            list[i] = i+1;
        }
        for(int i = 0;i<m;i++){
            array[i] = input.nextInt();
        }
        for(int j = 0; j<m; j++){
            int i = 0;
            int k = 0;
            while(i<h){
                if(list[i] != 0){
                    k++;
                    if(k%array[j] == 0){
                        list[i] = 0;
                    }
                }
                i++;
            }
        }
        for(int i = 0; i<h; i++){
            if(list[i] != 0){
                System.out.println(list[i]);
            }
        }
    }
    
}
//PASSED ALL DMOJ TESTS
