/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccontestlvl1_hmk.pkg3;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CContestLvl1_Hmk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //STAGE 1:
        Scanner input = new Scanner(System.in);
        String[][] array = new String[6][7];
        //enter your set of reds, yellows, and blanks
        String board = input.nextLine();
        
        for(int i = 0;i<6;i++){
            for(int j = 0;j<7;j++){
                array[i][j] = input.nextLine();
            }
        }
        for(int i = 0;i<6;i++){
            for(int j = 0;j<7;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        //Check Rows:
        for(int i, j = 0;;){
            
        }
    }
    
}
