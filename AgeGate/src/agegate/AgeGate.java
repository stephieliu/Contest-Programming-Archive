/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agegate;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AgeGate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [][] birthdates = new int [5][3];
        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                birthdates [i][j] = input.nextInt();
            }
        }
        for(int i = 0; i<5; i++){
            if(2010-birthdates[i][2]>=13 && birthdates[i][1]<13 
                    && birthdates[i][1]<=10
                    && birthdates[i][0]<=27 && birthdates[i][0]<32){
                System.out.println("old enough");
            }
            else{
                System.out.println("too young");
            }
        }
    }
    
}
