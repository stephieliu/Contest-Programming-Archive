/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickingberries;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PickingBerries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();//width
        int H = input.nextInt();//height
        char [] [] bush = new char [H][W];
        String empty = input.nextLine();
        //get all the string values for the bush
        for(int i = 0; i<H; i++){
            String temp = input.nextLine();
            for(int j = 0; j<W; j++){
                bush[i][j] = temp.charAt(j);
            }
        }
        //check each character
        int c = 0;//count number of edible berries
        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                if(bush[i][j]=='o'){
                    bush[i][j] = ' ';
                    c++;
                }
                else if(bush[i][j]=='*'){
                    bush[i][j] = ' ';
                }
            }
        }
        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                System.out.print(bush[i][j]);
            }
            System.out.print("\n");
        }
        for(int i = 0; i<c; i++){
            System.out.print("o");
        }
        System.out.println();
    }
    
}
