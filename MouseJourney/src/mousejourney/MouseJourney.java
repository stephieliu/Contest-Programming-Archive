/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousejourney;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MouseJourney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        //set up a cage
        int [][] catCage = new int [R+1][C+1];
        boolean [][] isCat = new boolean[R+1][C+1];
        int nCat = input.nextInt();
        for(int i = 0; i<nCat; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            isCat[x][y] = true;
        }
        catCage[1][1] = 1;//initial path
        isCat[1][1] = true;
        for(int i = 1; i<catCage.length; i++){
            for(int j = 1; j<catCage[i].length; j++){
                if(!isCat[i][j]){
                    catCage[i][j] = catCage[i-1][j]+catCage[i][j-1];
                }
            }
        }
        System.out.println(catCage[R][C]);
    }
    
}
